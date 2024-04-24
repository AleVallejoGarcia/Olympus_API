package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.Routine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {

	List<Routine> findByUserId(Long userId);
    

}
