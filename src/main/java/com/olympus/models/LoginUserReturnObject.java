package com.olympus.models;

// This class represents the return object after user login
public class LoginUserReturnObject {
    private Long userId; // Stores the ID of the user
    private String userName; // Stores the name of the user
    private boolean mailAndPasswordAreCorrect; // Indicates whether the email and password provided are correct

    // Constructors
    public LoginUserReturnObject() {
    }

    public LoginUserReturnObject(Long userId, String userName, boolean mailAndPasswordAreCorrect) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.mailAndPasswordAreCorrect = mailAndPasswordAreCorrect;
    }

    // Getters and Setters
    // Get the user ID. Returns: The user ID (Long).
    public Long getuserId() {
        return userId;
    }

    // Sets the user ID. Parameters: userId (Long): The user ID.
    public void setuserId(Long userId) {
        this.userId = userId;
    }

    // Get the username. Returns: The name of the user (String).
    public String getuserName() {
        return userName;
    }

    // Sets the user name. Parameters: userName (String): The name of the user.
    public void setuserName(String userName) {
        this.userName = userName;
    }

    // Get the indication if the email and password provided are correct. Returns:
    // true if the email and password are correct, false otherwise (boolean).
    public boolean getmailAndPasswordAreCorrect() {
        return mailAndPasswordAreCorrect;
    }

    // Sets whether the email and password provided are correct.
    // Parameters: mailAndPasswordAreCorrect (boolean): Indicates whether the e-mail
    // and password are correct.
    public void setmailAndPasswordAreCorrect(boolean mailAndPasswordAreCorrect) {
        this.mailAndPasswordAreCorrect = mailAndPasswordAreCorrect;
    }
}
