package com.offcn.bean;

import java.io.Serializable;

/*
 *User
 *@author peizhu
 *@date 2020/10/7 21:25
 *@Version 1.0
 */
public class User implements Serializable {
    private Integer id;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
