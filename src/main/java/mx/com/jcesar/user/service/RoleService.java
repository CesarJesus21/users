package mx.com.jcesar.user.service;

import mx.com.jcesar.user.entity.RoleEntity;
import mx.com.jcesar.user.repository.RoleRepository;
import mx.com.jcesar.user.utils.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BasicService<RoleEntity> {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
}
