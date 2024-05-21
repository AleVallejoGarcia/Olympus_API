package com.olympus.models;

// This class represents the return object after user login
public class LoginUserReturnObject {
    private Long userId; // Stores the ID of the user
    private String userName; // Stores the name of the user
    private boolean mailAndPasswordAreCorrect; // Indicates whether the email and password provided are correct


    //Constructors
    public LoginUserReturnObject(){
    }

    public LoginUserReturnObject(Long userId, String userName , boolean mailAndPasswordAreCorrect) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.mailAndPasswordAreCorrect = mailAndPasswordAreCorrect;
    }


    //Getters and Setters
    public Long getuserId() {
        return userId;
    }

    public void setuserId(Long userId) {
        this.userId = userId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public boolean getmailAndPasswordAreCorrect() {
        return mailAndPasswordAreCorrect;
    }

    public void setmailAndPasswordAreCorrect(boolean mailAndPasswordAreCorrect) {
        this.mailAndPasswordAreCorrect = mailAndPasswordAreCorrect;
    }
}

