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
    private long id;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = true, length = 200)
    private String urlImage;

    @Column(nullable = true)
    private Boolean gived;

    public Achievement() {
    }

    public Achievement(String description, String urlImage, Boolean gived) {
        super();
        this.description = description;
        this.urlImage = urlImage;
        this.gived = gived;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String mail) {
        this.urlImage = mail;
    }

    public Boolean getGived() {
        return gived;
    }

    public void setGived(Boolean gived) {
        this.gived = gived;
    }

    @Override
    public String toString() {
        return "Achievement [id=" + id + ", description=" + description + ", urlImage=" + urlImage
                + "]";
    }
}
