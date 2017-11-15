package com.example.yw.javademo;

/**
 * Created on 2017/11/14  11:40.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class RectObj {
    private int x;
    private int y;

    public RectObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        RectObj o = (RectObj) obj;
        if (x != o.getX() || y != o.getY()) {
            return false;
        }
        return false;
    }
}
