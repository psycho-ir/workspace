package com.sarabadani.workspace.guice;

import com.google.inject.AbstractModule;

/**
 * Created by soroosh on 3/8/15.
 */
public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
//        this.bind(MessageService.class).to(FacebookService.class);
        this.bind(MessageService.class).to(EmailService.class);
    }
}
