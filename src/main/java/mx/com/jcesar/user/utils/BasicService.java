package mx.com.jcesar.user.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;


import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;



public class BasicService<T extends BaseEntity> {


    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private GenericRepository<T> genericRepository;


    public ResponseEntity get(Map<String, String> filters, Pageable page){

        filters.remove("size");
        filters.remove("page");
        filters.remove("sort");
        Specification<T> specification = null;
        for(String key : filters.keySet()){
            SearchCriteria searchCriteria = new SearchCriteria(key, filters.get(key));

            if(Objects.isNull(specification))
                specification = Specification.where(new CustomSpecification<>(searchCriteria));
            else
                specification.and(new CustomSpecification<>(searchCriteria));
        }

        if(Objects.isNull(specification))
            return ResponseEntity.ok(genericRepository.findAll(page).getContent());

        return ResponseEntity.ok(genericRepository.findAll(specification, page).getContent());
        
    }

    public ResponseEntity create(T entity){
        return ResponseEntity.status(HttpStatus.CREATED).body(genericRepository.save(entity));
    }

    public ResponseEntity delete(String id){
        Optional<T> entity = genericRepository.findById(id);
        if(!entity.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        genericRepository.delete(entity.get());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(entity.get());
    }


    public ResponseEntity update(String id, Map<String, String> entity){
        Optional<T> oldEntityOptional = genericRepository.findById(id);
        if(!oldEntityOptional.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        T oldEntity = oldEntityOptional.get();

        entity.forEach((s,o)->{
            Field field = ReflectionUtils.findField(oldEntity.getClass(), s);
            ReflectionUtils.makeAccessible(field);
            ReflectionUtils.setField(field, oldEntity, o);
        });
        return  ResponseEntity.ok(genericRepository.save(oldEntity));
    }

}
