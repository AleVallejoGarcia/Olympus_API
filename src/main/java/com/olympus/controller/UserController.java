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

    @GetMapping("/user/{name}")
    public User getUser(@PathVariable String name) {
        return userRepository.findByName(name);
    }
    
    @PostMapping("/user")
    public User createUser(@RequestBody User userRequest) {
    	return userRepository.save(userRequest);
    }
    
    @PutMapping("/user/{id}")
    public User updateUserById(@PathVariable Long id , @RequestBody User userRequest) {
    	return userRepository.findById(id).map( user -> {
            user.setName(userRequest.getName());
            user.setMail(userRequest.getMail());
            user.setPassword(userRequest.getPassword());
            user.setHeight(userRequest.getHeight());
            user.setWeight(userRequest.getWeight());
            
            return userRepository.save(user);
            }).orElseThrow(
            () -> new ResourceNotFoundException("User not found with id " + id)
            );
    }
    
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
    	try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println("User Id " + id + " not found");
		}
    }
    

}
