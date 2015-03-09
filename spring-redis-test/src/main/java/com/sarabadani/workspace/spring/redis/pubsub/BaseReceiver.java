package com.sarabadani.workspace.spring.redis.pubsub;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by soroosh on 3/9/15.
 */
public abstract class BaseReceiver<T> {
    private final Class<T> clazz;
    private final ObjectMapper mapper = new ObjectMapper();

    public BaseReceiver(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void handleMessage(String msg) {
        try {
            this.onMessage(mapper.readValue(msg, clazz));
        } catch (IOException e) {
            throw new IllegalArgumentException("Message is not appropriate");
        }

    }

    public abstract void onMessage(T msg);


}
