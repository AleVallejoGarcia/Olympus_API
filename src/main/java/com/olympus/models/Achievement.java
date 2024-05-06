package com.olympus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Achievement() {
    }

    public Achievement(String achievementDescription, String achievementUrlImage, Boolean gived) {
        super();
        this.achievementDescription = achievementDescription;
        this.achievementUrlImage = achievementUrlImage;
        this.gived = gived;
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
