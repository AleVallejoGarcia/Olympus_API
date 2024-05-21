package com.olympus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.MuscleZone;

@Repository // Indicates that this interface is a repository component
public interface MuscleZoneRepository extends JpaRepository<MuscleZone, Long>{
	
	
}
