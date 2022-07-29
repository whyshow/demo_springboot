package com.example.demo.model;

public class UsersModel{
    private long usersId;
    private String usersName,usersToken;

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersToken() {
        return usersToken;
    }

    public void setUsersToken(String usersToken) {
        this.usersToken = usersToken;
    }
}
