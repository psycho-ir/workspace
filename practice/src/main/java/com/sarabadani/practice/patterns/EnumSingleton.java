package com.sarabadani.practice.patterns;

import java.util.EnumSet;

/**
 * Created by soroosh on 12/1/14.
 */
public enum EnumSingleton implements SingInterface {
    INSTANCE(100, 200) {},
    INSTANCE2(100, 100) {
        @Override
        public void sayHello() {
            super.sayHello();
            System.out.printf("NEW");
        }
    };


    private final Integer minPoolsize;
    private final Integer maxPoolSize;

    @Override
    public void sayHello() {
        System.out.println("HI");
    }


    public Integer getMinPoolsize() {
        return this.minPoolsize;
    }


    EnumSingleton(Integer minPoolsize, Integer maxPoolSize) {
        this.minPoolsize = minPoolsize;
        this.maxPoolSize = maxPoolSize;
    }

    public static void main(String... args) {
        EnumSingleton.INSTANCE.sayHello();
        EnumSingleton.INSTANCE2.sayHello();
        EnumSet<EnumSingleton> set = EnumSet.of(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE2);

    }


}
