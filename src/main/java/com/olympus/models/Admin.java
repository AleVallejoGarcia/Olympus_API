package com.olympus.models;

public class Admin {

    private long id;
    private String name;
    private String mail;
    private String password;

    public Admin() {
    }

    public Admin(String name, String mail, String password) {
        super();
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", name=" + name + ", mail=" + mail
                + "]";
    }
}
