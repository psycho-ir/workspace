package com.sarabadani.practice.eventbus;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by soroosh on 12/2/14.
 */
public class Program extends Observable {
    public static class SimpleObserver implements Observer {

        @Override
        public void update(Observable o, Object arg) {
            System.out.println("updated???? " + o + " " + arg);
        }
    }

    public static void main(String[] args) {
        Program program = new Program();
        SimpleObserver o = new SimpleObserver();
        program.addObserver(o);
        program.setChanged();
        program.notifyObservers("WOW");
        program.setChanged();
        program.notifyObservers();
        System.out.println(program.countObservers());


    }
}
