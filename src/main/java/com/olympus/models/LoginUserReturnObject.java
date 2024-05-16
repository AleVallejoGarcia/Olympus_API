package com.olympus.models;

public class LoginUserReturnObject {
    private Long userId;
    private String userName;
    private boolean mailAndPasswordAreCorrect;

    public LoginUserReturnObject(){
    }

    public LoginUserReturnObject(Long userId, String userName , boolean mailAndPasswordAreCorrect) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.mailAndPasswordAreCorrect = mailAndPasswordAreCorrect;
    }



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

