package com.example.yw.javademo.annotation;

/**
 * Created on 2017/11/14  17:09.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

@TestAnnotation(word = "222")
public class MyTest {

    @TestAnnotation(word = "333", arr = {2, 3, 4})
    public void output() {
        System.out.print("output some thing");
    }
}
