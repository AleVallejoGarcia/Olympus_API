package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.exception.ResourceNotFoundException;
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

    @GetMapping("/user/{userName}")
    public User getUser(@PathVariable String userName) {
        return userRepository.findByUserName(userName);
    }
    
    @PostMapping("/user")
    public User createUser(@RequestBody User userRequest) {
    	return userRepository.save(userRequest);
    }
    
    @PutMapping("/user/{userId}")
    public User updateUserById(@PathVariable Long userId , @RequestBody User userRequest) {
    	return userRepository.findById(userId).map( user -> {
            user.setuserName(userRequest.getuserName());
            user.setuserMail(userRequest.getuserMail());
            user.setuserPassword(userRequest.getuserPassword());
            user.setuserHeight(userRequest.getuserHeight());
            user.setuserWeight(userRequest.getuserWeight());
            
            return userRepository.save(user);
            }).orElseThrow(
            () -> new ResourceNotFoundException("User not found with id " + userId)
            );
    }
    
    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable Long userId) {
    	try {
			userRepository.deleteById(userId);
		} catch (Exception e) {
			System.out.println("User Id " + userId + " not found");
		}
    }
    

}
