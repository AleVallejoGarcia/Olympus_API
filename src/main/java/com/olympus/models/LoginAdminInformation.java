package com.olympus.models;
// This class represents the login information for an admin
public class LoginAdminInformation {
    private String adminMail; // Stores the admin's email
    private String adminPassword; // Stores the admin's password

    //Constructors
    public LoginAdminInformation(){
    }

    public LoginAdminInformation(String adminMail, String adminPassword) {
        super();
        this.adminMail = adminMail;
        this.adminPassword = adminPassword;
    }

    //Getters and Setters
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
