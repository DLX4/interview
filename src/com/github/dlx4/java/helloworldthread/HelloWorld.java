package com.github.dlx4.java.helloworldthread;

/**
 * @program: interview
 * @description: 打印一个java的hello world 程序运行起了多少个线程
 * @author: dlx
 * @created: 2020/07/14 22:52
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        ThreadGroup topGroup = group;
        while (group != null) {
            topGroup = group;
            group = group.getParent();
        }
        int nowThreads = topGroup.activeCount();
        Thread[] lstThreads = new Thread[nowThreads];
        topGroup.enumerate(lstThreads);
        for (int i = 0; i < nowThreads; i++) {
            System.out.println("线程number：" + i + " = " + lstThreads[i].getName());
        }
    }
}