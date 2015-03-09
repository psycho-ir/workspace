package com.sarabadani.workspace.spring.redis.pubsub;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

/**
 * Created by soroosh on 3/9/15.
 */
public abstract class BaseReceiver<T> {
    private final Class clazz;
    private final ObjectMapper mapper = new ObjectMapper();

    public BaseReceiver() {
        Class clz = getClass();
        while (clz.getSuperclass() != BaseReceiver.class) {
            clz = clz.getSuperclass();
        }
        this.clazz = (Class<T>) ((ParameterizedType) clz.getGenericSuperclass()).getActualTypeArguments()[0];

    }

    public void handleMessage(String msg) {
        try {
            this.onMessage((T) mapper.readValue(msg, clazz));
        } catch (IOException e) {
            throw new IllegalArgumentException("Message is not appropriate");
        }

    }

    public abstract void onMessage(T msg);


}
