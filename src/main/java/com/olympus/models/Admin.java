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
    private String adminName;

    @Column(nullable = false, length = 20)
    private String adminMail;

    @Column(nullable = false, length = 20)
    private String adminPassword;

    public Admin() {
    }

    public Admin(String adminName, String adminMail, String adminPassword) {
        super();
        this.adminName = adminName;
        this.adminMail = adminMail;
        this.adminPassword = adminPassword;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setId(Long id) {
        this.adminId = id;
    }

    public String getadminName() {
        return adminName;
    }

    public void setadminName(String adminName) {
        this.adminName = adminName;
    }

    public String getadminMail() {
        return adminMail;
    }

    public void setadminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    public String getadminPassword() {
        return adminPassword;
    }

    public void setadminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
