package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.Routine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository // Indicates that this interface is a repository component
public interface RoutineRepository extends JpaRepository<Routine, Long> {
    // Query method to find routines by user ID
	List<Routine> findByUserId(Long userId);
}
