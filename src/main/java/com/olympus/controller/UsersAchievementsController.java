package com.olympus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.olympus.models.UsersAchievements;
import com.olympus.repositories.UsersAchievementsRepository;

@Repository
@RequestMapping("olympus/v1")
public class UsersAchievementsController {

    @Autowired
    UsersAchievementsRepository usersAchievementsRepository;

    @GetMapping("/usersAchivements/{userId}")
    public List<UsersAchievements> getAchievementsByUsedId(@PathVariable Long userId) {
        return usersAchievementsRepository.findAllByUserId(userId);
    }

}
