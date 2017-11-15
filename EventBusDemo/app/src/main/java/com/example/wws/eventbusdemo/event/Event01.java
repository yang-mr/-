package com.example.wws.eventbusdemo.event;

/**
 * Created on 2017/11/15  12:07.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class Event01 {
    private String name;
    private int age;

    public Event01(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
