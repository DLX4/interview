package com.github.dlx4.java.rwlock;

import java.util.concurrent.locks.StampedLock;

/**
 * @program: interview
 * @description: Stamped Lock ，支持读写锁并优化了读
 * @author: dlx
 * @created: 2020/07/14 22:40
 */
public class StampedSample {
//    private final StampedLock sl = new StampedLock();
//
//    void mutate() {
//        long stamp = sl.writeLock();
//        try {
//            write();
//        } finally {
//            sl.unlockWrite(stamp);
//        }
//    }
//
//    Data access() {
//        long stamp = sl.tryOptimisticRead();
//        Data data = read();
//        if (!sl.validate(stamp)) {
//            stamp = sl.readLock();
//            try {
//                data = read();
//            } finally {
//                sl.unlockRead(stamp);
//            }
//        }
//        return data;
//    }
    // …
}
