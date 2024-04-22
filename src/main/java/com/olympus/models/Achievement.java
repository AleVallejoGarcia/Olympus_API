package com.olympus.models;

public class Achievement {
    private long id;
    private String description;
    private String urlImage;
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
