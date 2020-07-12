package com.github.dlx4.java.counter;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * @program: interview
 * @description: 利用原始数据类型
 * @author: dlx
 * @created: 2020/07/11 15:14
 */

class CompactCounter {
    private volatile long counter;
    private static final AtomicLongFieldUpdater<CompactCounter> updater = AtomicLongFieldUpdater.newUpdater(CompactCounter.class, "counter");
    public void increase() {
        updater.incrementAndGet(this);
    }
}
