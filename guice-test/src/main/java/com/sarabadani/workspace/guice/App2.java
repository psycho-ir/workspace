package com.sarabadani.workspace.guice;

import com.google.inject.Inject;

/**
 * Created by soroosh on 3/8/15.
 */
public class App2 {
    private final MessageService messageService;

    @Inject
    public App2(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String msg) {
        this.messageService.sendMessage(msg);
    }
}
