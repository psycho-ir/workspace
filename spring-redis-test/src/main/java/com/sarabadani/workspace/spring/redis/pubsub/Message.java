package com.sarabadani.workspace.spring.redis.pubsub;

import java.io.Serializable;

/**
 * Created by soroosh on 3/9/15.
 */
public class Message implements Serializable {
    private Message(){

        message = null;
        title = null;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    private final String title;
    private final String message;

    public Message(String title,String message){

        this.title = title;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
