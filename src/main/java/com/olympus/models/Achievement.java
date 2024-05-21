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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "achievements")
public class Achievement {

    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key values
    @Column(name = "achievement_id") // Specifies the column name in the database table
    private long achievementId; // Represents the ID of the achievement

    @Column(nullable = false, length = 200) // Specifies the column properties
    private String achievementDescription; // Represents the description of the achievement

    @Column(nullable = true, length = 200) // Specifies the column properties
    private String achievementUrlImage; // Represents the URL of the image associated with the achievement

    @Column(nullable = true) // Specifies the column properties
    private Boolean gived; // Represents whether the achievement has been given

    // Establishes a many-to-many relationship with the User entity, specifying the mapping details
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "achievements")
    @OnDelete(action = OnDeleteAction.CASCADE) // Specifies the action to be taken on deletion of the associated User entity
    @JsonIgnore // Ignores this property during JSON serialization
    private Set<User> user = new HashSet<>(); // Represents the set of users associated with this achievement

    // Default constructor
    public Achievement() {
    }

    // Parameterized constructor
    public Achievement(String achievementDescription, String achievementUrlImage) {
        super();
        this.achievementDescription = achievementDescription;
        this.achievementUrlImage = achievementUrlImage;
    }

    // Getters and setters

    public Long getachievementId() {
        return achievementId;
    }

    public void setachievementId(Long achievementId) {
        this.achievementId = achievementId;
    }

    public String getachievementDescription() {
        return achievementDescription;
    }

    public void setachievementDescription(String name) {
        this.achievementDescription = name;
    }

    public String getachievementUrlImage() {
        return achievementUrlImage;
    }

    public void setachievementUrlImage(String mail) {
        this.achievementUrlImage = mail;
    }

    public Boolean getGived() {
        return gived;
    }

    public void setGived(Boolean gived) {
        this.gived = gived;
    }

    public void setUsers(Set<User> user) {
        this.user = user;
    }

    public Set<User> getUser() {
        return this.user;
    }
}
