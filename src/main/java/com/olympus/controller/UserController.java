package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.exception.ResourceNotFoundException;
import com.olympus.models.LoginUserInformation;
import com.olympus.models.LoginUserReturnObject;
import com.olympus.models.User;
import com.olympus.repositories.UserRepository;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class UserController {

    @Autowired // Injects an instance of UserRepository
    UserRepository userRepository;

    // Handler method to retrieve all users
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Handler method to verify user login credentials
    @PostMapping("/user/verifyUser")
    public LoginUserReturnObject verifyUser(@RequestBody LoginUserInformation userRequest) {
        User userToVerify = userRepository.findByUserMail(userRequest.getuserMail());
        LoginUserReturnObject userIsCorrect = new LoginUserReturnObject(userToVerify.getUserId(), userToVerify.getuserName(), true);
        LoginUserReturnObject userIsNotCorrect = new LoginUserReturnObject(0L, "", false);
        if (userToVerify != null && userRequest.getuserPassword().equals(userToVerify.getuserPassword()) ) {
             return userIsCorrect;
         } else {
             return userIsNotCorrect;
         }
    }

    // Handler method to create a new user
    @PostMapping("/user")
    public User createUser(@RequestBody User userRequest) {
        return userRepository.save(userRequest);
    }

    // Handler method to update user information by user ID
    @PutMapping("/user/{userId}")
    public User updateUserById(@PathVariable Long userId, @RequestBody User userRequest) {
        return userRepository.findById(userId).map(user -> {
            user.setuserName(userRequest.getuserName());
            user.setuserMail(userRequest.getuserMail());
            user.setuserPassword(userRequest.getuserPassword());
            user.setuserHeight(userRequest.getuserHeight());
            user.setuserWeight(userRequest.getuserWeight());

            return userRepository.save(user);
        }).orElseThrow(
                () -> new ResourceNotFoundException("User not found with id " + userId));
    }

    // Handler method to delete a user by user ID
    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        try {
            userRepository.deleteById(userId);
        } catch (Exception e) {
            System.out.println("User Id " + userId + " not found");
        }
    }

}
