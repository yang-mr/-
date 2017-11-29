package com.example.yw.mvp.dagger2_demo.demo3;

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

    @AQulifier
    @Inject
    Cpu acpu;

    @BQulifier
    @Inject
    Cpu bcpu;


    public Computer() {
//        com.example.yw.mvp.dagger2_demo.demo2.DaggerComputerComponent.create().inject(this);
        com.example.yw.mvp.dagger2_demo.demo3.DaggerComputerComponent.builder().cpuModule(new CpuModule()).build().inject(this);
    }

    public void run() {

    }
}
