package com.yw.ipcdemo;

import java.io.Serializable;

/**
 * Created by yw on 17/10/26.
 * author jackyang
 * com.yw.ipcdemo
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1l;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
