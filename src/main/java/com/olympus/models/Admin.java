package com.olympus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Marks the class as an entity managed by JPA
@Table(name = "admins") // Specifies the name of the table in the database
public class Admin {

    @Id // Marks the field as the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures the primary key generation strategy
    @Column(name = "admin_id") // Specifies the column name in the table
    private long adminId;

    @Column(nullable = false, length = 30) // Specifies the column properties
    private String adminName;

    @Column(nullable = false, length = 20, unique = true) // Specifies the column properties
    private String adminMail; // Admin's email (must be unique)

    @Column(nullable = false, length = 20) // Specifies the column properties
    private String adminPassword;

    // Constructors
    public Admin() {
    }

    public Admin(String adminName, String adminMail, String adminPassword) {
        super();
        this.adminName = adminName;
        this.adminMail = adminMail;
        this.adminPassword = adminPassword;
    }

    // Getters and Setters

    // Gets the ID of the administrator. Returns: The administrator ID (Long).
    public Long getAdminId() {
        return adminId;
    }

    // Sets the ID of the administrator. Parameters: id (Long): The ID of the
    // administrator.
    public void setId(Long id) {
        this.adminId = id;
    }

    // Get the name of the administrator.Returns: The name of the administrator
    // (String).
    public String getadminName() {
        return adminName;
    }

    // Sets the name of the administrator. Parameters: adminName (String): The name
    // of the administrator.
    public void setadminName(String adminName) {
        this.adminName = adminName;
    }

    // Get the admin's email address. Returns: The email address of the
    // administrator (String).
    public String getadminMail() {
        return adminMail;
    }

    // Sets the admin email. Parameters: adminMail (String): The administrator's
    // email address.
    public void setadminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    // Get the administrator password. Returns: The administrator password (String).
    public String getadminPassword() {
        return adminPassword;
    }

    // Sets the administrator password. Parameters: adminPassword (String): The
    // password of the administrator.
    public void setadminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
