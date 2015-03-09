package com.sarabadani.workspace.spring.redis.pubsub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * Created by soroosh on 3/9/15.
 */
public class Receiver extends BaseReceiver<Message> {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
    private final CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        super(Message.class);
        this.latch = latch;
    }

    @Override
    public void onMessage(Message msg) {
        System.out.println(msg);
    }
}
