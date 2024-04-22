package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.UsersAchievements;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsersAchievementsRepository extends JpaRepository<UsersAchievements, Long> {
    List<UsersAchievements> findAllByUserId(Long userId);
}
