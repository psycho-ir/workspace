package com.sarabadani.practice;

/**
 * Created by soroosh on 11/29/14.
 */
public class PersonUser {
    private Person person;
    private final String name;

    public PersonUser(String name){
        this.name = name;
    }


    public Person getPerson() {
        return this.person;
    }

}
