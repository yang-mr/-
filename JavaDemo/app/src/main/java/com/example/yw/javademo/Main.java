package org.xutils.sample.javademo;

import android.util.Log;

import org.xutils.sample.javademo.annotation.MyAnnotation;

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created on 2017/11/14  11:47.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        RectObj r1 = new RectObj(1, 2);
        RectObj r2 = new RectObj(2, 3);
        RectObj r3 = new RectObj(1, 2);
        HashSet set = new HashSet();
        set.add(r1);
        set.add(r2);
        set.add(r3);
        System.out.println(set.size());
        r1.setX(10);
        set.remove(r1);
        System.out.print(set.size());


        //测试注解
        Main main = new Main();
        try {
            Method method = main.getClass().getMethod("handler", null);
            boolean is = method.isAnnotationPresent(MyAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


}
