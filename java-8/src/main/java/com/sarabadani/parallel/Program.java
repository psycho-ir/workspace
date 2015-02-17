package com.sarabadani.parallel;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;


/**
 * Created by soroosh on 1/26/15.
 */
public class Program {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        executorService.submit(() -> System.out.println("Hi"));

        System.out.println(range(1, 1_000_000).filter((a) -> a % 2 == 0).mapToObj((a) -> new Integer(a)).collect(toList()));

    }

}
