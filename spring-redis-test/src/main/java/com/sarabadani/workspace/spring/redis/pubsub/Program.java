package com.sarabadani.workspace.spring.redis.pubsub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.CountDownLatch;

/**
 * Created by soroosh on 3/9/15.
 */
public class Program {
    public static void main(String[] args) throws InterruptedException {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("redis-context.xml");

        RedisTemplate template = ctx.getBean(RedisTemplate.class);
        CountDownLatch latch = ctx.getBean(CountDownLatch.class);

        System.out.println("Sending message...");
        template.convertAndSend("chat", new Message("sos","ssssso"));

        latch.await();
        System.exit(0);
    }
}
