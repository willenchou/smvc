package com.test.model;

public class UserInfo {
    private Long positionInt;

    private String name;

    private String passwd;

    public Long getPositionInt() {
        return positionInt;
    }

    public void setPositionInt(Long positionInt) {
        this.positionInt = positionInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }
}