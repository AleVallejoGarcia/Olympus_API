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

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private long exerciseId;

    @Column(nullable = false, length = 30)
    private String exerciseName;

    @Column(nullable = false, length = 200)
    private String exerciseDescription;

    @Column(nullable = false, length = 200)
    private String urlImage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_muscle_zone_id", nullable = false)
    @JsonIgnore
    private MuscleZone muscleZone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "exercise_routine_table", joinColumns = @JoinColumn(name = "fk_exercise_id"), inverseJoinColumns = @JoinColumn(name = "fk_routine_id"))
    @JsonIgnore
    private Set<Routine> routines = new HashSet<>();

    public Exercise() {
    }

    public Exercise(String exerciseName, String exerciseDescription, String urlImage, long fk_muscle_zone_id) {
        super();
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
        this.urlImage = urlImage;
    }

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
