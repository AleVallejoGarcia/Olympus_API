package com.olympus.models;

public class Exercise {
    private long id;
    private String name;
    private String description;
    private String urlImage;
    private long fk_muscle_zone_id;

    public Exercise() {
    }

    public Exercise(String name, String description, String urlImage, long fk_muscle_zone_id) {
        super();
        this.name = name;
        this.description = description;
        this.urlImage = urlImage;
        this.fk_muscle_zone_id = fk_muscle_zone_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public long getFk_muscle_zone_id() {
        return fk_muscle_zone_id;
    }

    public void setFk_muscle_zone_id(long fk_muscle_zone_id) {
        this.fk_muscle_zone_id = fk_muscle_zone_id;
    }

    @Override
    public String toString() {
        return "Routine [id=" + id + ", name=" + name + ", fk_muscle_zone_id=" + fk_muscle_zone_id

                + "]";
    }
}
