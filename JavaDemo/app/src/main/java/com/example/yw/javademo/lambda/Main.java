package com.example.yw.javademo.lambda;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 17-11-30.
 *
 * @DESCRIPTION --------------------
 */

public class Main {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        test1();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void test1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        /*list.stream()
                .map(name -> name.length())
                .forEach(s -> System.out.println(s + " sb"));*/


    }
}
