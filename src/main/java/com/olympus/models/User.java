package com.olympus.models;

public class User {
    private long id;
    private String name;
    private String mail;
    private String password;
    private float height;
    private float weight;

    public User() {
    }

    public User(String name, String mail, String password, float height, float weight) {
        super();
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.height = height;
        this.weight = weight;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", name=" + name + ", mail=" + mail
                + "]";
    }
}
