package com.example.yw.mvp.dagger2_demo.demo4;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 2017/11/3000:15.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

@Module
public class CpuModule {

    @ComputerScope
    @Provides
    Cpu CpuProvide() {
        return new Cpu("a");
    }
}
