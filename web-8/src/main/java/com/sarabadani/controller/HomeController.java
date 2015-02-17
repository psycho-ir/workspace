package com.sarabadani.controller;

import com.sarabadani.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by soroosh on 12/8/14.
 */

@Controller
public class HomeController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello";

    }
}
