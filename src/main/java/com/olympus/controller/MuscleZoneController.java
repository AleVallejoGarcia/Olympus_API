package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.MuscleZone;
import com.olympus.repositories.MuscleZoneRepository;

@RestController // Indicates that this class is a REST controller
@RequestMapping("/olympus/v1") // Base URL mapping for all request handlers in this class
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allowing cross-origin requests
public class MuscleZoneController {

    @Autowired // Injects an instance of MuscleZoneRepository
    MuscleZoneRepository muscleZoneRepository;

    // Handler method to retrieve all muscle zones
    @GetMapping("/muscle_zone")
    public List<MuscleZone> getAllMuscleZones() {
        return muscleZoneRepository.findAll();
    }

    // Handler method to retrieve a muscle zone by ID
    @GetMapping("/muscle_zone/{muscleZoneId}")
    public Optional<MuscleZone> getMuscleZonesByMuscleZoneId(@PathVariable Long muscleZoneId) {
        return muscleZoneRepository.findById(muscleZoneId);
    }

}
