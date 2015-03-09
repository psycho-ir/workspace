package com.sarabadani.workspace.guice;

import com.google.inject.Singleton;

/**
 * Created by soroosh on 3/8/15.
 */
@Singleton
public class FacebookService implements MessageService {
    @Override
    public boolean sendMessage(String msg) {
        System.out.println("A facebopk message sent: " + msg);
        return false;
    }
}
