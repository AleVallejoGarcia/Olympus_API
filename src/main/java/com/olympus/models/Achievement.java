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

@Entity
@Table(name = "achievements")
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    private long achievementId;

    @Column(nullable = false, length = 200)
    private String achievementDescription;

    @Column(nullable = true, length = 200)
    private String achievementUrlImage;

    @Column(nullable = true)
    private Boolean gived;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "achievements")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<User> users = new HashSet<>();

    public Achievement() {
    }

    public Achievement(String achievementDescription, String achievementUrlImage) {
        super();
        this.achievementDescription = achievementDescription;
        this.achievementUrlImage = achievementUrlImage;
    }

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
}
