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

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(nullable = false, length = 30)
    private String userName;

    @Column(nullable = false, length = 30)
    private String userMail;

    @Column(nullable = false, length = 30)
    private String userPassword;

    @Column(nullable = false, length = 30)
    private float userHeight;

    @Column(nullable = false, length = 30)
    private float userWeight;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "users_achievements_table", joinColumns = @JoinColumn(name = "fk_user_id"), inverseJoinColumns = @JoinColumn(name = "fk_achievement_id"))
    @JsonIgnore
    private Set<Achievement> achievements = new HashSet<>();

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
    
}
