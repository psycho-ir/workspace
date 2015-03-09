package com.sarabadani.workspace.spring.redis.pubsub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * Created by soroosh on 3/9/15.
 */
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
    private final CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String msg) {
        System.out.println("Received <-- " + msg + " -->");
        latch.countDown();
    }
}
