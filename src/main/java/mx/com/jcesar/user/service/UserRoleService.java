package mx.com.jcesar.user.service;

import mx.com.jcesar.user.entity.UserRoleEntity;
import mx.com.jcesar.user.repository.UserRoleRepository;
import mx.com.jcesar.user.utils.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService extends BasicService<UserRoleEntity> {

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }
}
