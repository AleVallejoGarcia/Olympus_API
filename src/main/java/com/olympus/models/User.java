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

    @Column(nullable = false, length = 30)// Specifies the column properties
    private String userName;

    @Column(nullable = false, length = 30, unique = true)// Specifies the column properties
    private String userMail;

    @Column(nullable = false, length = 30)// Specifies the column properties
    private String userPassword;

    @Column(nullable = false, length = 30)// Specifies the column properties
    private float userHeight;

    @Column(nullable = false, length = 30)// Specifies the column properties
    private float userWeight;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }) // Specifies a many-to-many relationship with the Achievement entity
    @JoinTable(name = "users_achievements_table", joinColumns = @JoinColumn(name = "fk_user_id"), inverseJoinColumns = @JoinColumn(name = "fk_achievement_id")) // Specifies the join table and its columns
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

    public Long getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserMail() {
        return userMail;
    }

    public void setuserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getuserPassword() {
        return userPassword;
    }

    public void setuserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public float getuserHeight() {
        return userHeight;
    }

    public void setuserHeight(float userHeight) {
        this.userHeight = userHeight;
    }

    public float getuserWeight() {
        return userWeight;
    }

    public void setuserWeight(float userWeight) {
        this.userWeight = userWeight;
    }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    public void setAchievements(Set<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Set<Achievement> getAchievements() {
        return this.achievements;
    }

}
