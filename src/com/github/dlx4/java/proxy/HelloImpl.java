package com.github.dlx4.java.proxy;

/**
 * @program: interview
 * @description: 接口实现类
 * @author: dlx
 * @created: 2020/07/11 11:34
 */
public class HelloImpl implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    public void sayHello2() {
        System.out.println("Hello World222");
    }
}