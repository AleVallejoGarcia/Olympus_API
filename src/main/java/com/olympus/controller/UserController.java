package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.User;
import com.olympus.repositories.UserRepository;

@RestController
@RequestMapping("/olympus/v1")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable String name) {
        return userRepository.findByName(name);
    }

}
