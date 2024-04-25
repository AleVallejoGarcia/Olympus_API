package com.olympus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.models.MuscleZone;
import com.olympus.repositories.MuscleZoneRepository;

@RestController
@RequestMapping("/olympus/v1")
public class MuscleZoneController {

    @Autowired
    MuscleZoneRepository muscleZoneRepository;

    @GetMapping("/muscle_zone")
    public List<MuscleZone> getAllMuscleZones() {
        return muscleZoneRepository.findAll();
    }

    @GetMapping("/muscle_zone/{id}")
    public Optional<MuscleZone> getMuscleZonesById(@PathVariable Long id) {
        return muscleZoneRepository.findById(id);
    }

}
