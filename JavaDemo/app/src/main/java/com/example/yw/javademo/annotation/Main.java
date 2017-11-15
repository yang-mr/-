package org.xutils.sample.javademo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created on 2017/11/14  17:00.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        //测试注解
     //   测试注解();

        Class myTest = MyTest.class;

        MyTest m = new MyTest();

        System.out.print(myTest == m.getClass());

        try {
            Method method = myTest.getMethod("output", null);
            TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
            method.invoke(m, null);
            int[] arr = annotation.arr();
            String h = annotation.hello();
            Class c = annotation.style();
            MyAnnotation myAnnotation = annotation.myAnnotation();
            myAnnotation.value();

            MyAnnotation[] annotations = (MyAnnotation[]) method.getAnnotations();
            for (Annotation a : annotations) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void 测试注解() {
        org.xutils.sample.javademo.Main main = new org.xutils.sample.javademo.Main();
        try {
            Method method = main.getClass().getMethod("handler", null);
            boolean is = method.isAnnotationPresent(MyAnnotation.class);
            System.out.print(is + "");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
