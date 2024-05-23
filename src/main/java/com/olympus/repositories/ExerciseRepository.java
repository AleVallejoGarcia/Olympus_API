package com.olympus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympus.models.Exercise;

@Repository // Indicates that this interface is a repository component
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    // Query method to find all exercises by muscle zone ID Parameters:
    // muscle_zone_id (Long): The ID of the muscle area.Return: A list of exercises
    // associated with the given muscle area.
    List<Exercise> findAllByMuscleZoneId(Long muscle_zone_id);

    // Query method to find all exercises by routine ID Parameters: routineId
    // (Long): The ID of the routine.Return: A list of exercises associated with the
    // given routine.
    List<Exercise> findAllByRoutinesId(Long routineId);
}
