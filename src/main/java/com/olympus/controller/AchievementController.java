package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Achievement;
import com.olympus.repositories.AchievementsRepository;

@RestController
@RequestMapping("/olympus/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AchievementController {

    @Autowired
    AchievementsRepository achievementsRepository;

    @GetMapping("/achievements")
    public List<Achievement> getAllAchievements() {
        return achievementsRepository.findAll();
    }

    @GetMapping("/achievements/{achievementId}")
    public Optional<Achievement> getAchievementByAchievementId(@PathVariable Long achievementId) {
        return achievementsRepository.findById(achievementId);
    }
}