package com.olympus.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Achievement;
import com.olympus.models.User;
import com.olympus.repositories.AchievementsRepository;
import com.olympus.repositories.UserRepository;

@RestController
@RequestMapping("/olympus/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AchievementController {

    @Autowired
    AchievementsRepository achievementsRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/achievements")
    public List<Achievement> getAllAchievements() {
        return achievementsRepository.findAll();
    }

    @GetMapping("/achievements/{achievementId}")
    public Optional<Achievement> getAchievementByAchievementId(@PathVariable Long achievementId) {
        return achievementsRepository.findById(achievementId);
    }

    @GetMapping("{userId}/achievements")
    public List<Achievement> getAchievementsByUser(@PathVariable Long userId) {
        return achievementsRepository.findByUsers_Id(userId);
    }

    @PostMapping("/achievements/{achievementId}/users/{userId}")
    public Achievement addAchievementToUser(@PathVariable(name = "achievementId") Long achievementId,
            @PathVariable(name = "userId") Long userId) {
        Optional<Achievement> achievement = achievementsRepository.findById(achievementId);
        Optional<User> user = userRepository.findById(userId);
        Set<Achievement> achievements = user.get().getAchievements();
        Set<User> users = achievement.get().getUser();
        achievements.add(achievement.get());
        users.add(user.get());
        achievement.get().setUsers(users);
        user.get().setAchievements(achievements);
        userRepository.save(user.get());
        return achievementsRepository.save(achievement.get());
    }
}
