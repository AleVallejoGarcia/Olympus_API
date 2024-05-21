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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.Achievement;
import com.olympus.models.User;
import com.olympus.repositories.AchievementsRepository;
import com.olympus.repositories.UserRepository;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class AchievementController {

    @Autowired // Injects an instance of AchievementsRepository
    AchievementsRepository achievementsRepository;

    @Autowired // Injects an instance of UserRepository
    UserRepository userRepository;

    // Handler method to retrieve all achievements
    @GetMapping("/achievements")
    public List<Achievement> getAllAchievements() {
        return achievementsRepository.findAll();
    }

    // Handler method to retrieve a specific achievement by ID
    @GetMapping("/achievements/{achievementId}")
    public Optional<Achievement> getAchievementByAchievementId(@PathVariable Long achievementId) {
        return achievementsRepository.findById(achievementId);
    }

    // Handler method to retrieve all achievements of a specific user
    @GetMapping("/{userId}/achievements")
    public List<Achievement> getAchievementsByUser(@PathVariable Long userId) {
        return achievementsRepository.findByUser_UserId(userId);
    }

    // Handler method to add an achievement to a user
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

    // Handler method to remove an achievement from a user
    @DeleteMapping("/achievements/{achievementId}/users/{userId}")
    public void removeAchievementFromUser(@PathVariable(name = "achievementId") Long achievementId,
            @PathVariable(name = "userId") Long userId) {
        Optional<Achievement> achievement = achievementsRepository.findById(achievementId);
        Optional<User> user = userRepository.findById(userId);
        Set<Achievement> achievements = user.get().getAchievements();
        Set<User> users = achievement.get().getUser();
        achievements.remove(achievement.get());
        users.remove(user.get());
        achievement.get().setUsers(users);
        user.get().setAchievements(achievements);
        userRepository.save(user.get());
        achievementsRepository.save(achievement.get());
    }
}
