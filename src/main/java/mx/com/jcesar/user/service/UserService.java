package mx.com.jcesar.user.service;

import mx.com.jcesar.user.entity.UserEntity;
import mx.com.jcesar.user.repository.UserRepository;
import mx.com.jcesar.user.utils.BasicService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService extends BasicService<UserEntity> {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
