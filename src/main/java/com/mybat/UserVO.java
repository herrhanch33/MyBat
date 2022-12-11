package com.mybat;

public class UserVO {
    private String userid;
    private String password;
    private String username;
    public String getUserID(){
        return userid;
    }

    public void setUserid(String userid){
        this.userid = userid;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
}
