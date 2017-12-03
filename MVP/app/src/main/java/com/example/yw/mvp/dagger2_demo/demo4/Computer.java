package com.example.yw.mvp.dagger2_demo.demo4;

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
    Cpu acpu;

    @Inject
    Cpu bcpu;

    public Computer() {
        com.example.yw.mvp.dagger2_demo.demo4.DaggerComputerComponent.builder()
                .cpuModule(new CpuModule()).build().inject(this);
    }
}
