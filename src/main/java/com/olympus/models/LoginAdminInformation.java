package com.olympus.models;

public class LoginAdminInformation {
    private String adminMail;
    private String adminPassword;

    public LoginAdminInformation(){
    }

    public LoginAdminInformation(String adminMail, String adminPassword) {
        super();
        this.adminMail = adminMail;
        this.adminPassword = adminPassword;
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
