package com.olympus.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity // Specifies that the class is an entity and is mapped to a database table
@Table(name = "users") // Specifies the name of the database table to be used for mapping
public class User {

    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key values
    @Column(name = "user_id") // Specifies the column name in the database table
    private long userId; // Represents the ID of the user

    @Column(nullable = false, length = 30) // Specifies the column properties
    private String userName;

    @Column(nullable = false, length = 30, unique = true) // Specifies the column properties
    private String userMail;

    @Column(nullable = false, length = 30) // Specifies the column properties
    private String userPassword;

    @Column(nullable = false, length = 30) // Specifies the column properties
    private float userHeight;

    @Column(nullable = false, length = 30) // Specifies the column properties
    private float userWeight;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }) // Specifies a
                                                                                              // many-to-many
                                                                                              // relationship with the
                                                                                              // Achievement entity
    @JoinTable(name = "users_achievements_table", joinColumns = @JoinColumn(name = "fk_user_id"), inverseJoinColumns = @JoinColumn(name = "fk_achievement_id")) // Specifies
                                                                                                                                                                // the
                                                                                                                                                                // join
                                                                                                                                                                // table
                                                                                                                                                                // and
                                                                                                                                                                // its
                                                                                                                                                                // columns
    @JsonIgnore // Ignores the achievements property during JSON serialization
    private Set<Achievement> achievements = new HashSet<>(); // Represents the achievements of the user

    // Constructor
    public User() {
    }

    public User(String userName, String userMail, String userPassword, float userHeight, float userWeight) {
        super();
        this.userName = userName;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
    }

    // Getters and Setters

    // Get the user ID. Returns: The user ID (Long).
    public Long getUserId() {
        return userId;
    }

    // Sets the user ID. Parameters: userId (Long): The user ID.
    public void setId(Long id) {
        this.userId = id;
    }

    // Get the username. Returns: The name of the user (String).
    public String getuserName() {
        return userName;
    }

    // Sets the user name. Parameters: userName (String): The name of the user.
    public void setuserName(String userName) {
        this.userName = userName;
    }

    // Get the user's email address. Returns: The user's email address (String).
    public String getuserMail() {
        return userMail;
    }

    // Sets the user's email address. Parameters: userMail (String): The user's
    // email address.
    public void setuserMail(String userMail) {
        this.userMail = userMail;
    }

    // Get the user's password. Returns: The user's password (String).
    public String getuserPassword() {
        return userPassword;
    }

    // Sets the user's password. Parameters: userPassword (String): The password of
    // the user.
    public void setuserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // Gets the height of the user. Returns: The height of the user (float).
    public float getuserHeight() {
        return userHeight;
    }

    // Sets the height of the user. Parameters: userHeight (float): The height of
    // the user.
    public void setuserHeight(float userHeight) {
        this.userHeight = userHeight;
    }

    // Gets the user's weight. Returns: The user's weight (float).
    public float getuserWeight() {
        return userWeight;
    }

    // Sets the user's weight. Parameters: userWeight (float): The user's weight.
    public void setuserWeight(float userWeight) {
        this.userWeight = userWeight;
    }

    // Add an achievement to the set. Parameters: achievement the new achievement
    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    // Sets the user's achievements. Parameters: achievements (Set): The user's
    // achievements.
    public void setAchievements(Set<Achievement> achievements) {
        this.achievements = achievements;
    }

    // Obtains the user's achievements. Returns: The user's achievements (Set).
    public Set<Achievement> getAchievements() {
        return this.achievements;
    }

}
