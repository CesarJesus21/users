package mx.com.jcesar.user.repository;

import mx.com.jcesar.user.entity.UserEntity;
import mx.com.jcesar.user.utils.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;



public interface UserRepository extends GenericRepository<UserEntity> {

}
