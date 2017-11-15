package org.xutils.sample.javademo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2017/11/14  17:05.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    String hello() default "ho";
    String word();
    int[] arr() default {2, 2, 3, 4};
    MyAnnotation myAnnotation() default @MyAnnotation(value="222");
    Class style() default String.class;
}
