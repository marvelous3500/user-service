package com.userService.userService.Controller;

import com.userService.userService.model.User;
import com.userService.userService.service.UserServiceLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;




@RestController
@RequestMapping("api/v1/users")
public class UserController implements Serializable {

    private static final long serialVersionUID = 4771967336318814550L;

    @Autowired
    private UserServiceLocal userServiceLocal;


    @PostMapping
    User createUser(@RequestBody User user){return userServiceLocal.createUser(user); }

    @GetMapping
    public List<User> getUsers(){
        return userServiceLocal.getAllUser();
    }


}

