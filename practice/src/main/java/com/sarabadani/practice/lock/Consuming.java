package com.sarabadani.practice.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by soroosh on 12/1/14.
 */
public class Consuming<T> {
    public static void main(String... args) throws InterruptedException {
        final ReentrantLock lock1 = new ReentrantLock();
        final ReentrantLock lock2 = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    lock1.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock1 acquired by t1");
                try {
                    Thread.sleep(5000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    lock2.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock2 acquired by t1");
                System.out.println("You could come here wow!");
                lock2.unlock();
                lock1.unlock();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    lock2.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock2 acquired by t2");
                try {
                    lock1.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock1 acquired by t2");
                System.out.println("You could come here wow!");
                try {
                    Thread.sleep(50000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        executorService.shutdownNow();

    }
}
