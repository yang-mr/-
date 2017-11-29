package com.example.yw.mvp.dagger2_demo.demo1;

import javax.inject.Inject;

/**
 * Created on 2017/11/3000:01.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Cpu {

    @Inject
    public Cpu() {
        System.out.println("my name is cpu");
    }
}
