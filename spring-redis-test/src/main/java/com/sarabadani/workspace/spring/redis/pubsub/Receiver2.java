package com.sarabadani.workspace.spring.redis.pubsub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * Created by soroosh on 3/9/15.
 */
public class Receiver2 extends Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver2.class);

    @Autowired
    public Receiver2(CountDownLatch latch) {
        super(latch);
    }

    @Override
    public void onMessage(Message msg) {

        System.out.println("from 2");
        System.out.println(msg);
    }
}
