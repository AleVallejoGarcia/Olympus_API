package com.olympus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.models.Exercise;
import com.olympus.models.MuscleZone;
import com.olympus.models.Routine;
import com.olympus.models.User;
import com.olympus.repositories.ExerciseRepository;
import com.olympus.repositories.MuscleZoneRepository;
import com.olympus.repositories.RoutineRepository;
import com.olympus.repositories.UserRepository;

@Service // Marks this class as a Spring service
public class ManyToOneService {

    @Autowired // Automatically injects the ExerciseRepository dependency
    ExerciseRepository exerciseRepository;

    @Autowired // Automatically injects the MuscleZoneRepository dependency
    MuscleZoneRepository muscleZoneRepository;

    @Autowired // Automatically injects the UserRepository dependency
    UserRepository userRepository;

    @Autowired // Automatically injects the RoutineRepository dependency
    RoutineRepository routineRepository;

    // Saves an Exercise entity to the database Parameters: exercise (Exercise): The
    // Exercise entity to save. Return: The Exercise entity saved
    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    // Saves a Routine entity to the database Parameters: routine (Routine): The
    // Routine entity to save. Return: The Routine entity saved.
    public Routine saveRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    // Saves a User entity to the database Parameters: user (User): The User entity
    // to save. Return: The saved User entity.
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Saves a MuscleZone entity to the database Parameters: muscleZone
    // (MuscleZone): The MuscleZone entity to save.Return: The saved MuscleZone
    // entity.
    public MuscleZone saveMuscleZone(MuscleZone muscleZone) {
        return muscleZoneRepository.save(muscleZone);

    }
}
