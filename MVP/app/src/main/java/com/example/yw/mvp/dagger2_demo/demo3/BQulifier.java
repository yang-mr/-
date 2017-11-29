package com.example.yw.mvp.dagger2_demo.demo3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created on 2017/11/3000:37.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BQulifier {
}
