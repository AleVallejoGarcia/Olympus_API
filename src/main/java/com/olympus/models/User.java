package com.olympus.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String mail;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 30)
    private float height;

    @Column(nullable = false, length = 30)
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

    public Long getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
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
        return "Actor [id=" + userId + ", name=" + name + ", mail=" + mail
                + "]";
    }
}
