package com.sarabadani.practice;

/**
 * Created by soroosh on 11/29/14.
 */
public class Person {
    public void setName(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public boolean equals(Object o) {
       return true;
    }


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;

    }
}
