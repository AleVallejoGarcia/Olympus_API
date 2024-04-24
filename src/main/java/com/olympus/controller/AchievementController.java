package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Achievement;
import com.olympus.models.Routine;
import com.olympus.repositories.AchievementsRepository;

@RestController
@RequestMapping("/olympus/v1")
public class AchievementController {

    @Autowired
    AchievementsRepository achievementsRepository;
    
    @GetMapping("/achievements")
    public List<Achievement> getAllAchievements() {
        return achievementsRepository.findAll();
    }

    @GetMapping("/achievements/{id}")
    public Optional<Achievement> getAchievementById(@PathVariable Long id) {
        return achievementsRepository.findById(id);
    }
}