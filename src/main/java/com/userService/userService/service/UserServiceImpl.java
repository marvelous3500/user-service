package com.userService.userService.service;

import com.userService.userService.repository.UserRepository;
import com.userService.userService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceLocal, Serializable {

    private static final long serialVersionUID = -7730898466931950464L;
    private final transient UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
