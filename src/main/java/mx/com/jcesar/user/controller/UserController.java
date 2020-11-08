package mx.com.jcesar.user.controller;

import mx.com.jcesar.user.entity.UserEntity;
import mx.com.jcesar.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity get(@RequestParam HashMap<String, String> params, Pageable pageable){
        return this.userService.get(params, pageable);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody UserEntity userEntity){
        return this.userService.create(userEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") String id,@RequestBody Map<String, String> entity){
        return this.userService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") String id){
        return this.userService.delete(id);
    }
}
