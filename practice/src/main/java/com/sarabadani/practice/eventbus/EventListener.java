package com.sarabadani.practice.eventbus;

/**
 * Created by soroosh on 12/2/14.
 */
public interface EventListener<T> {
    void listen(EventContext eventContext);
}
