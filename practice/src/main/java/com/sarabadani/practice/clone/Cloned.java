package com.sarabadani.practice.clone;

/**
 * Created by soroosh on 11/30/14.
 */
public class Cloned implements Cloneable {

    public Object[] fakeMethod() {
        return null;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
