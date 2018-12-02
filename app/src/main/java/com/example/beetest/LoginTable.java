package com.example.beetest;

public class LoginTable {

    /**
     * Item username
     */
    @com.google.gson.annotations.SerializedName("UserName")
    private String UserName;

    /**
     * Item password
     */
    @com.google.gson.annotations.SerializedName("Password")
    private String Password;

    public LoginTable(){

    }

    /**
     * Returns the userName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Sets the username
     */
    public void setUserName(String text) {
        UserName = text;
    }

    /**
     * Returns the password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * sets the password
     */
    public void setPassword(String text) {
        Password = text;
    }

}
