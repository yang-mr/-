package com.example.yw.mvp.dagger2_demo.demo2;

import com.example.yw.mvp.dagger2_demo.demo1.DaggerComputerComponent;

import javax.inject.Inject;

/**
 * Created on 2017/11/3000:00.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Computer {

    @Inject
    Cpu cpu;

    public Computer() {
        com.example.yw.mvp.dagger2_demo.demo2.DaggerComputerComponent.create().inject(this);
    }

    public void run() {

    }
}
