package com.sarabadani.practice.eventbus;

/**
 * Created by soroosh on 12/2/14.
 */
public interface EventPublisher {
    void regiterListener(EventListener listener,Class<?> token);

    <T> T publish(EventContext eventContext, Class<?> token);
}
