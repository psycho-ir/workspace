package com.sarabadani.practice.factory;

/**
 * Created by soroosh on 11/30/14.
 */
public class Foo {
    private static class SubFoo extends Foo {

    }

    private Foo() {
    }

    public static Foo cachedFoo() {
        return new SubFoo();
    }

}
