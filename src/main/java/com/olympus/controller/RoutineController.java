package com.olympus.controller;



import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Routine;
import com.olympus.repositories.RoutineRepository;

@RestController
@RequestMapping("/olympus/v1")
public class RoutineController {

    @Autowired
    RoutineRepository routineRepository;
/* <<<<<<< HEAD
    
    @GetMapping("/routines")
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
=======

    @GetMapping("/routines/{userId}")
    public List<Routine> getRoutineByUsedId(@PathVariable Long userId) {
        return routineRepository.findByUserId(userId);
>>>>>>> e6c25e65cd519514032ee332dfbb8a93cbd731b8
    }
 */
    @GetMapping("/routines/{id}")
    public Optional<Routine> getRoutineById(@PathVariable Long id) {
        return routineRepository.findById(id);
    }

/* <<<<<<< HEAD
    
=======
    @PostMapping("/routines/{userId}")
    public Routine addRoutineToUser(@RequestBody Routine routineRequest) {
        return routineRepository.save(routineRequest);
    }

>>>>>>> e6c25e65cd519514032ee332dfbb8a93cbd731b8 */
}
