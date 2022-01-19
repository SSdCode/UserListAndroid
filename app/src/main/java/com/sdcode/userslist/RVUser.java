package com.sdcode.userslist;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class RVUser {
    private String userName;
    private Integer genderId;
    private String email;

    public RVUser(Integer genderId, String name, String email) {
        this.userName = name;
        this.genderId = genderId;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public Integer getGenderId() {
        return genderId;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
