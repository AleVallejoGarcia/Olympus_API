package com.olympus.models;

public class LoginUserInformation {
    private String userMail;
    private String userPassword;

    public LoginUserInformation(){
    }

    public LoginUserInformation(String userMail, String userPassword) {
        super();
        this.userMail = userMail;
        this.userPassword = userPassword;
    }

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
