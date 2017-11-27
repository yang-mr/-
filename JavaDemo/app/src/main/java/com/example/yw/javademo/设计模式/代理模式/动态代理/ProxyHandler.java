package com.example.yw.javademo.设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by root on 17-11-27.
 *
 * @DESCRIPTION --------------------
 */

public class ProxyHandler implements InvocationHandler {
    private Object mTarget;

    private ProxyHandler() {

    }

    public ProxyHandler(Object target) {
        this.mTarget = target;
    }

    public Object getProxt() {
        return Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String name = method.getName();
        if (name.equals("move")) {
            //return method;
            System.out.println("我是代理类执行");
            return null;
        }

        return method.invoke(mTarget, objects);
    }
}
