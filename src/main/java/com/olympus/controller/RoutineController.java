package com.olympus.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Exercise;
import com.olympus.models.Routine;
import com.olympus.models.User;
import com.olympus.repositories.ExerciseRepository;
import com.olympus.repositories.RoutineRepository;
import com.olympus.repositories.UserRepository;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class RoutineController {

    @Autowired // Injects an instance of RoutineRepository
    RoutineRepository routineRepository;

    @Autowired // Injects an instance of UserRepository
    UserRepository userRepository;

    @Autowired // Injects an instance of ExerciseRepository
    ExerciseRepository exerciseRepository;

    // Handler method to retrieve all routines
    @GetMapping("/routines")
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

    // Handler method to retrieve routines by user ID
    @GetMapping("/users/{userId}/routines")
    public List<Routine> getRoutineByUsedId(@PathVariable Long userId) {
        return routineRepository.findByUserId(userId);
    }

    // Handler method to retrieve a routine by ID
    @GetMapping("/routines/{routineId}")
    public Optional<Routine> getRoutineByRoutineId(@PathVariable Long routineId) {
        return routineRepository.findById(routineId);
    }

    // Handler method to delete a routine by ID
    @DeleteMapping("/routines/{routineId}")
    public void deleteRoutine(@PathVariable Long routineId) {
        routineRepository.deleteById(routineId);
    }

    // Handler method to add a routine to a user
    @PostMapping("/routines/{userId}")
    public Routine addRoutineToUser(@RequestBody Routine routineRequest, @PathVariable(name = "userId") Long userId) {
        Optional<User> user = userRepository.findById(userId);
        routineRequest.setUser(user.get());
        return routineRepository.save(routineRequest);
    }

    // Handler method to add an exercise to a routine
    @PostMapping("/excercies/{exerciseId}/routines/{routineId}")
    public Routine addExerciseToRoutine(@PathVariable(name = "exerciseId") Long exerciseId,
            @PathVariable(name = "routineId") Long routineId) {
        Optional<Exercise> exercise = exerciseRepository.findById(exerciseId);
        Optional<Routine> routine = routineRepository.findById(routineId);
        Set<Routine> routines = exercise.get().getRoutines();
        Set<Exercise> exercises = routine.get().getExercises();
        exercises.add(exercise.get());
        routines.add(routine.get());
        exercise.get().setRoutines(routines);
        routine.get().setExercises(exercises);
        exerciseRepository.save(exercise.get());
        return routineRepository.save(routine.get());

    }

    // Handler method to remove an exercise from a routine
    @DeleteMapping("/excercies/{exerciseId}/routines/{routineId}")
    public void removeExerciseFromRoutine(@PathVariable(name = "exerciseId") Long exerciseId,
            @PathVariable(name = "routineId") Long routineId) {
        Optional<Exercise> exercise = exerciseRepository.findById(exerciseId);
        Optional<Routine> routine = routineRepository.findById(routineId);
        Set<Routine> routines = exercise.get().getRoutines();
        Set<Exercise> exercises = routine.get().getExercises();
        exercises.remove(exercise.get());
        routines.remove(routine.get());
        exercise.get().setRoutines(routines);
        routine.get().setExercises(exercises);
        exerciseRepository.save(exercise.get());
        routineRepository.save(routine.get());
    }
}
