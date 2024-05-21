package com.olympus.models;

// This class represents the login information for an user
public class LoginUserInformation {
    private String userMail; // Stores the user email
    private String userPassword; // Stores the user password

    //Constructors
    public LoginUserInformation(){
    }

    public LoginUserInformation(String userMail, String userPassword) {
        super();
        this.userMail = userMail;
        this.userPassword = userPassword;
    }

    //Getters and Setters
    public String getuserMail() {
        return userMail;
    }

    public void setuserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getuserPassword() {
        return userPassword;
    }

    public void setuserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
