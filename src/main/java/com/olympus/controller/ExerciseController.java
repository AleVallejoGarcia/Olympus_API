package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Exercise;
import com.olympus.repositories.ExerciseRepository;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class ExerciseController {

    @Autowired // Injects an instance of ExerciseRepository
    ExerciseRepository exerciseRepository;

    // Handler method to retrieve all exercises
    @GetMapping("/exercises")
    public List<Exercise> getAllExercises(){
    	return exerciseRepository.findAll();
    }
    
    // Handler method to retrieve an exercise by ID
    @GetMapping("/exercises/{exerciseId}")
    public Optional<Exercise> getAllExercises(@PathVariable Long exerciseId){
    	return exerciseRepository.findById(exerciseId);
    }
    
    // Handler method to retrieve exercises by muscle zone ID
    @GetMapping("/muscleZone/{muscleZoneId}/exercises")
    public List<Exercise> getExercisesByMuscleZoneId(@PathVariable Long muscleZoneId) {
        return exerciseRepository.findAllByMuscleZoneId(muscleZoneId);
    }
    
    // Handler method to retrieve exercises from a routine by routine ID
    @GetMapping("/routines/{routineId}/exercises")
    public List<Exercise> getAllExercisesFromaRoutineById(@PathVariable Long routineId) {
        return exerciseRepository.findAllByRoutinesId(routineId);
    }

}
