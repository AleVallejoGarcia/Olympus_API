package com.olympus.models;

// This class represents the login information for an user
public class LoginUserInformation {
    private String userMail; // Stores the user email
    private String userPassword; // Stores the user password

    // Constructors
    public LoginUserInformation() {
    }

    public LoginUserInformation(String userMail, String userPassword) {
        super();
        this.userMail = userMail;
        this.userPassword = userPassword;
    }

    // Getters and Setters

    // Get the user's email address. Returns: The user's email address (String).
    public String getuserMail() {
        return userMail;
    }

    // Sets the user's email address. Parameters: userMail (String): The user's
    // email address.
    public void setuserMail(String userMail) {
        this.userMail = userMail;
    }

    // Get the user's password. Returns: The user's password (String).
    public String getuserPassword() {
        return userPassword;
    }

    // Sets the user's password. Parameters: userPassword (String): The password of
    // the user.
    public void setuserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
