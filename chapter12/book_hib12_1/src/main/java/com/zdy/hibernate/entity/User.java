package com.zdy.hibernate.entity;

public class User {
    private int id;
    private String LoginName;
    private String LoginPwd;
    private String tureName;

    public User() {
    }

    public User(String loginName, String loginPwd, String tureName) {

        LoginName = loginName;
        LoginPwd = loginPwd;
        this.tureName = tureName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getLoginPwd() {
        return LoginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        LoginPwd = loginPwd;
    }

    public String getTureName() {
        return tureName;
    }

    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", LoginName='" + LoginName + '\'' +
                ", LoginPwd='" + LoginPwd + '\'' +
                ", tureName='" + tureName + '\'' +
                '}';
    }
}
