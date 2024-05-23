package com.olympus.models;

// This class represents the login information for an admin
public class LoginAdminInformation {
    private String adminMail; // Stores the admin's email
    private String adminPassword; // Stores the admin's password

    // Constructors
    public LoginAdminInformation() {
    }

    public LoginAdminInformation(String adminMail, String adminPassword) {
        super();
        this.adminMail = adminMail;
        this.adminPassword = adminPassword;
    }

    // Getters and Setters

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
