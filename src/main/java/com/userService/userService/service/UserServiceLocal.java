package com.userService.userService.service;

import com.userService.userService.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserServiceLocal {

     User createUser(User user);
     User updateUser(Long id, User user);
     List<User> getAllUser();



}
