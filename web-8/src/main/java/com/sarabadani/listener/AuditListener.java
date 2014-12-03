package com.sarabadani.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by soroosh on 11/25/14.
 */
public class AuditListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(String.format("Session: %s created for %s",se.getSession().getId(),se.getSession().getAttributeNames()));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
