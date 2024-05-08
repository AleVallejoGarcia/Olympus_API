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

@Service
public class ManyToManyService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    RoutineRepository routineRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AchievementsRepository achievementsRepository;

    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Routine saveRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Achievement saveAchievement(Achievement achievement) {
        return achievementsRepository.save(achievement);
    }

}
