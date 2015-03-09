package com.sarabadani.workspace.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by soroosh on 3/8/15.
 */
public class Program {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        final App instance = injector.getInstance(App.class);
        final App2 instance2 = injector.getInstance(App2.class);
        instance.sendMessage("hey");
        instance2.sendMessage("hey");
    }
}
