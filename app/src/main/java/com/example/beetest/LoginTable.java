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

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    public LoginTable(){

    }

    public LoginTable(String pword, String User) {
       // this.mId = id;
        this.UserName = User;
        this.Password = pword;

    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
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
