package com.github.dlx4.java.counter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: interview
 * @description: 计数器
 * @author: dlx
 * @created: 2020/07/11 15:12
 */

class Counter {
    private final AtomicLong counter = new AtomicLong();
    public void increase() {
        counter.incrementAndGet();
    }
}
