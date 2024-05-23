package com.olympus.models;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Specifies that the class is an entity and is mapped to a database table
@Table(name = "routines") // Specifies the name of the database table to be used for mapping
public class Routine {

    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key values
    @Column(name = "routine_id") // Specifies the column name in the database table
    private long routineId; // Represents the ID of the routine

    @Column(nullable = false, length = 40) // Specifies the column properties
    private String routineName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) // Specifies a many-to-one relationship with the User entity
    @JoinColumn(name = "fk_user_id", nullable = false) // Specifies the join column in the database table
    @JsonIgnore // Ignores the User property during JSON serialization
    private User user; // Represents the user associated with the routine

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "routines") // Specifies
                                                                                                                     // a
                                                                                                                     // many-to-many
                                                                                                                     // relationship
                                                                                                                     // with
                                                                                                                     // the
                                                                                                                     // Exercise
                                                                                                                     // entity
    @OnDelete(action = OnDeleteAction.CASCADE) // Specifies the delete action to be taken on associated records
    @JsonIgnore // Ignores the exercises property during JSON serialization
    private Set<Exercise> exercises = new HashSet<>(); // Represents the exercises included in the routine

    // Constructors
    public Routine() {
    }

    public Routine(String routineName) {
        super();
        this.routineName = routineName;
    }

    // Getters and Setters

    // Gets the ID of the routine. Returns: The ID of the routine (Long).
    public Long getRoutineId() {
        return routineId;
    }

    // Sets the ID of the routine. Parameters: routineId (Long): The ID of the
    // routine.
    public void setId(Long id) {
        this.routineId = id;
    }

    // Get the name of the routine.Returns: The name of the routine (String).
    public String getroutineName() {
        return routineName;
    }

    // Sets the name of the routine. Parameters: routineName (String): The name of
    // the routine.
    public void setName(String routineName) {
        this.routineName = routineName;
    }

    // Gets the user associated with the routine. Returns: The associated user.
    public User getUser() {
        return user;
    }

    // Sets the user associated with the routine. Parameters: user (User): The
    // associated user.
    public void setUser(User user) {
        this.user = user;
    }

    // Gets the exercises included in the routine. Returns: The exercises included
    // in the routine (Set).
    public Set<Exercise> getExercises() {
        return exercises;
    }

    // Sets the exercises included in the routine. Parameters: exercises (Set): The
    // exercises included in the routine.
    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }

}
