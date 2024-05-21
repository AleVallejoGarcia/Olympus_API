package com.olympus.models;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Specifies that the class is an entity and is mapped to a database table
@Table(name = "exercises") // Specifies the name of the database table to be used for mapping
public class Exercise {

    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key values
    @Column(name = "exercise_id") // Specifies the column name in the database table
    private long exerciseId;

    @Column(nullable = false, length = 30) // Specifies the column properties
    private String exerciseName;

    @Column(nullable = false, length = 400) // Specifies the column properties
    private String exerciseDescription;

    @Column(nullable = false, length = 200) // Specifies the column properties
    private String urlImage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // Specifies a many-to-one relationship with MuscleZone entity
    @JoinColumn(name = "fk_muscle_zone_id", nullable = false)// Specifies the join column in the database table
    @JsonIgnore // Ignores this property during JSON serialization
    private MuscleZone muscleZone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })// Specifies a many-to-many relationship with Routine entity
    // Specifies the join table name and the inverse join column in the join table
    @JoinTable(name = "exercise_routine_table", joinColumns = @JoinColumn(name = "fk_exercise_id"), inverseJoinColumns = @JoinColumn(name = "fk_routine_id"))
    @JsonIgnore // Ignores this property during JSON serialization
    private Set<Routine> routines = new HashSet<>();

    // Constructors
    public Exercise() {
    }

    public Exercise(String exerciseName, String exerciseDescription, String urlImage) {
        super();
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
        this.urlImage = urlImage;
    }

    //Getters and Setters
    public Long getExerciseId() {
        return exerciseId;
    }

    public void setId(Long id) {
        this.exerciseId = id;
    }

    public String getexerciseName() {
        return exerciseName;
    }

    public void setexerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getexerciseDescription() {
        return exerciseDescription;
    }

    public void setexerciseDescription(String name) {
        this.exerciseDescription = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String mail) {
        this.urlImage = mail;
    }

    public MuscleZone getMuscleZone() {
        return muscleZone;
    }

    public void setMucleZone(MuscleZone muscleZone) {
        this.muscleZone = muscleZone;
    }

    public Set<Routine> getRoutines() {
        return routines;
    }

    public void setRoutines(Set<Routine> routines) {
        this.routines = routines;
    }
}
