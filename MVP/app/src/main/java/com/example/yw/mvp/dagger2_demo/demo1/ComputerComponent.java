package com.example.yw.mvp.dagger2_demo.demo1;

import dagger.Component;

/**
 * Created on 2017/11/3000:04.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

@Component
public interface ComputerComponent {
    void inject(Computer computer);
}
