package com.sarabadani.workspace.guice;

import com.google.inject.Singleton;

/**
 * Created by soroosh on 3/8/15.
 */
//@Singleton
public class EmailService implements MessageService {
    private int counter = 0;
    @Override
    public boolean sendMessage(String msg) {
        counter++;
        System.out.println("An email sent: " + msg);
        System.out.println(counter);
        return false;
    }
}
