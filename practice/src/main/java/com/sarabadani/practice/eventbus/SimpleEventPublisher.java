package com.sarabadani.practice.eventbus;

/**
 * Created by soroosh on 12/2/14.
 */
public class SimpleEventPublisher implements EventPublisher {


    @Override
    public void regiterListener(EventListener listener, Class<?> token) {

    }

    @Override
    public <T> T publish(EventContext eventContext, Class<?> token) {
        return null;
    }
}
