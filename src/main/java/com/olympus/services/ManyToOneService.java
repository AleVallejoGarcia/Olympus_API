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

@Service
public class ManyToOneService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    MuscleZoneRepository muscleZoneRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoutineRepository routineRepository;

    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Routine saveRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public MuscleZone saveMuscleZone(MuscleZone muscleZone) {
        return muscleZoneRepository.save(muscleZone);

    }
}
