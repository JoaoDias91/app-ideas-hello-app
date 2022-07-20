package com.joao.helloapp.entities;


import javax.validation.constraints.NotNull;


public class UserInfo {

    @NotNull
    private String userName;

    @NotNull
    private String userPassword;

    public UserInfo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
