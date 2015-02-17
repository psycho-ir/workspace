package com.sarabadani.service;

import org.springframework.stereotype.Service;

/**
 * Created by soroosh on 12/8/14.
 */
@Service
public class GreetingService {
    public String getGreeting() {
        return "Hello man!";
    }
}
