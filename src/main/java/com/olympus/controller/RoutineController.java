package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping("/routines/{userId}")
    public List<Routine> getRoutineByUsedId(@PathVariable Long userId) {
        return routineRepository.findByUserId(userId);
    }

    @DeleteMapping("/routines/{id}")
    public void deleteRoutine(@PathVariable Long id) {
        try {
            routineRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Routine Id " + id + " not found");
        }
    }
}
