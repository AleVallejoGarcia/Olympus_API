package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Routine;
import com.olympus.models.User;
import com.olympus.repositories.RoutineRepository;
import com.olympus.repositories.UserRepository;

@RestController
@RequestMapping("/olympus/v1")
public class RoutineController {

    @Autowired
    RoutineRepository routineRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/routines")
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

    @GetMapping("/users/{userId}/routines")
    public List<Routine> getRoutineByUsedId(@PathVariable Long userId) {
        return routineRepository.findByUserId(userId);
    }

    @GetMapping("/routines/{routineId}")
    public Optional<Routine> getRoutineByRoutineId(@PathVariable Long routineId) {
        return routineRepository.findById(routineId);
    }

    @PostMapping("/routines/{userId}")
    public Routine addRoutineToUser(@RequestBody Routine routineRequest, @PathVariable(name = "userId") Long userId) {
        Optional<User> user = userRepository.findById(userId);
        routineRequest.setUser(user.get());
        return routineRepository.save(routineRequest);
    }

}
