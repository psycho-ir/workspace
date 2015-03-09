package com.sarabadani.workspace.spring.redis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by soroosh on 3/9/15.
 */
public class Program {
    public static void main(String[] args) throws MalformedURLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("redis-context.xml");
        Example e = context.getBean("example",Example.class);
        e.addLink("soroosh",new URL("http://yahoo.com"));
        System.out.println("wow");
    }
}
