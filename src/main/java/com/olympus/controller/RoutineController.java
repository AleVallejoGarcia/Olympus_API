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
import com.olympus.repositories.RoutineRepository;

@RestController
@RequestMapping("/olympus/v1")
public class RoutineController {

    @Autowired
    RoutineRepository routineRepository;

    
    @GetMapping("/routines")
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

    @GetMapping("/routines/{userId}")
    public List<Routine> getRoutineByUsedId(@PathVariable Long userId) {
        return routineRepository.findByUserId(userId);
    }
 
    @GetMapping("/routines/{id}")
    public Optional<Routine> getRoutineById(@PathVariable Long id) {
        return routineRepository.findById(id);
    }

    @PostMapping("/routines/{userId}")
    public Routine addRoutineToUser(@RequestBody Routine routineRequest) {
        return routineRepository.save(routineRequest);
    }


}
