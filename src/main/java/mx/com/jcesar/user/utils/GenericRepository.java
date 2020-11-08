package mx.com.jcesar.user.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T> extends JpaRepository<T, String>, JpaSpecificationExecutor<T> {
}
