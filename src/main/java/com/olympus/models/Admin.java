package com.olympus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private long adminId;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 20)
    private String mail;

    @Column(nullable = false, length = 20)
    private String password;

    public Admin() {
    }

    public Admin(String name, String mail, String password) {
        super();
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setId(Long id) {
        this.adminId = id;
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

    @Override
    public String toString() {
        return "Actor [id=" + adminId + ", name=" + name + ", mail=" + mail
                + "]";
    }
}
