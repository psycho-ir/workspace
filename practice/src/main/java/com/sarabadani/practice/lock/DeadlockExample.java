package com.sarabadani.practice.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by soroosh on 12/2/14.
 */
public class DeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        Lock lock  = new ReentrantLock();
        lock.lock();
        Thread t1 = new Thread(()->{
            lock.lock();
            System.out.println("Never print!!!");
        });

        t1.run();
        t1.join();
    }
}
