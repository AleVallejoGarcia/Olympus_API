package com.olympus.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.Achievement;


@Repository
public interface AchievementsRepository extends JpaRepository<Achievement, Long> {

}
