package mx.com.jcesar.user.utils;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CustomSpecification<T> implements Specification<T> {

    private SearchCriteria searchCriteria;

    public CustomSpecification(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.get(searchCriteria.getKey()), searchCriteria.getValude());
    }
}
