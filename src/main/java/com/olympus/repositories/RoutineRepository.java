package com.olympus.repositories;

import org.springframework.stereotype.Repository;

import com.olympus.models.Routine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {
/* <<<<<<< HEAD
    Routine findByUserId(Long usedId);
    
=======
    List<Routine> findByUserId(Long usedId);
>>>>>>> e6c25e65cd519514032ee332dfbb8a93cbd731b8 */
}
