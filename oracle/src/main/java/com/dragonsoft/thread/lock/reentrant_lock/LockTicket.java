package com.dragonsoft.thread.lock.reentrant_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * jdk5之后使用Lock加锁
 */
public class LockTicket implements Runnable{

    private static int tickets = 9000;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
        }
        lock.unlock();
    }
}
