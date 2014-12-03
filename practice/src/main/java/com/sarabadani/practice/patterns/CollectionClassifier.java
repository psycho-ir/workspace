package com.sarabadani.practice.patterns;

import java.util.*;

/**
 * Created by soroosh on 12/1/14.
 */
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    static Integer i;
    public static void main(String[] args) {
        if (i == 42)
            System.out.println("Unbelievable");
    }

}

