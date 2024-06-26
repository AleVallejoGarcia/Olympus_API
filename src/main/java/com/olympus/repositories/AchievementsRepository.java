package com.olympus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.Achievement;

@Repository // Indicates that this interface is a repository component
public interface AchievementsRepository extends JpaRepository<Achievement, Long> {

    // Query method to find achievements by user ID Parameters: userId (Long): The
    // ID of the user whose achievements are to be found.Return: A list of
    // achievements associated with the given user ID.
    List<Achievement> findByUser_UserId(Long userId);

}
