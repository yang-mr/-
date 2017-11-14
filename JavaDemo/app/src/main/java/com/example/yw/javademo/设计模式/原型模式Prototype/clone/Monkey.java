package com.example.yw.javademo.设计模式.原型模式Prototype.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on 2017/11/1116:59.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Monkey implements Cloneable {
    private int height;
    private int weight;
    private Staff staff;
    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Monkey() {
        this.staff = new Staff();
        this.birthday = new Date();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public Object clone() {
        Monkey monkey = null;
        try {
            monkey = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkey;
    }

    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
