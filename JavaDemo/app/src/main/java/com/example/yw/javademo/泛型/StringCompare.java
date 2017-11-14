package com.example.yw.javademo.泛型;

/**
 * Created on 2017/11/922:12.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class StringCompare implements Comparable<StringCompare> {
    private String mStr;

    public StringCompare(String mStr) {
        this.mStr = mStr;
    }

    @Override
    public boolean compareTo(StringCompare i) {
        if (mStr.length() > i.mStr.length()) {
            return true;
        } else {
            return false;
        }
    }
}
