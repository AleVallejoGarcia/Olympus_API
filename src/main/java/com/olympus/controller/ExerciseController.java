package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Exercise;
import com.olympus.repositories.ExerciseRepository;

@RestController
@RequestMapping("/olympus/v1")
public class ExerciseController {

    @Autowired
    ExerciseRepository exerciseRepository;

    @GetMapping("/exercises/{muscleZoneId}")
    public List<Exercise> getExercisesByMuscleZoneId(@PathVariable Long muscleZoneId) {
        return exerciseRepository.findAllByMuscleZoneId(muscleZoneId);
    }

}