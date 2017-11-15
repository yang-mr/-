package com.example.yw.javademo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created on 2017/11/14  16:52.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String value();
}
