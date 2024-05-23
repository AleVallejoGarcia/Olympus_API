package com.olympus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.models.Achievement;
import com.olympus.models.Exercise;
import com.olympus.models.Routine;
import com.olympus.models.User;
import com.olympus.repositories.AchievementsRepository;
import com.olympus.repositories.ExerciseRepository;
import com.olympus.repositories.RoutineRepository;
import com.olympus.repositories.UserRepository;

@Service // Marks this class as a Spring service
public class ManyToManyService {

    @Autowired // Automatically injects the ExerciseRepository dependency
    ExerciseRepository exerciseRepository;

    @Autowired // Automatically injects the RoutineRepository dependency
    RoutineRepository routineRepository;

    @Autowired // Automatically injects the UserRepository dependency
    UserRepository userRepository;

    @Autowired // Automatically injects the AchievementsRepository dependency
    AchievementsRepository achievementsRepository;

    // Saves an Exercise entity to the database Parameters: exercise (Exercise): The
    // Exercise entity to save. Return: The Exercise entity saved.
    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    // Saves a Routine entity to the database Parameters:routine (Routine): The
    // Routine entity to save. Return:The Routine entity saved.
    public Routine saveRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    // Saves a User entity to the database Parameters: user (User): The User
    // entity to save.Return:The saved User entity.
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Saves an Achievement entity to the database Parameters: achievement
    // (Achievement): The Achievement entity to save. Return: The Achievement entity
    // saved.
    public Achievement saveAchievement(Achievement achievement) {
        return achievementsRepository.save(achievement);
    }

}
