package com.olympus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "muscle_zones")
public class MuscleZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "muscle_zone_id")
    private long muscleZoneId;

    @Column(nullable = false, length = 40)
    private String muscleName;

    public MuscleZone() {
    }

    public MuscleZone(String muscleName) {
        super();
        this.muscleName = muscleName;
    }

    public Long getMuscleZoneId() {
        return muscleZoneId;
    }

    public void setId(Long id) {
        this.muscleZoneId = id;
    }

    public String getmuscleName() {
        return muscleName;
    }

    public void setmuscleName(String muscleName) {
        this.muscleName = muscleName;
    }

    
}
