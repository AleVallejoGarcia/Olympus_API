package com.olympus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Specifies that the class is an entity and is mapped to a database table
@Table(name = "muscle_zones") // Specifies the name of the database table to be used for mapping
public class MuscleZone {

    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key values
    @Column(name = "muscle_zone_id") // Specifies the column name in the database table
    private long muscleZoneId; // Represents the ID of the muscle zone

    @Column(nullable = false, length = 40) // Specifies the column properties
    private String muscleName; // Represents the name of the muscle zone

    // Constructors
    public MuscleZone() {
    }

    public MuscleZone(String muscleName) {
        super();
        this.muscleName = muscleName;
    }

    // Getters and Setters
    // Get the ID of the muscle zone. Returns: The ID of the muscle area (Long).
    public Long getMuscleZoneId() {
        return muscleZoneId;
    }

    // Sets the ID of the muscle zone. Parameters: muscleZoneId (Long): The ID of
    // the muscle zone.
    public void setId(Long id) {
        this.muscleZoneId = id;
    }

    // Get the name of the muscle area. Returns: The name of the muscle zone
    // (String).
    public String getmuscleName() {
        return muscleName;
    }

    // Sets the name of the muscle area.Parameters: muscleName (String): The name of
    // the muscle zone.
    public void setmuscleName(String muscleName) {
        this.muscleName = muscleName;
    }

}
