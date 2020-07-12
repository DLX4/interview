package com.github.dlx4.java.proxy;

import java.lang.reflect.Proxy;

/**
 * @program: interview
 * @description: 动态代理
 * @author: dlx
 * @created: 2020/07/11 11:31
 */
public class MyDynamicProxy {

    public static void main(String[] args) {
        HelloImpl hello = new HelloImpl();
        MyInvocationHandler handler = new MyInvocationHandler(hello);
        // 构造代码实例
        Hello proxyHello = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces(), handler);
        // 调用代理方法
        proxyHello.sayHello();
        proxyHello.sayHello2();
    }
}