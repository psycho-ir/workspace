package com.sarabadani.practice.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by soroosh on 11/30/14.
 */
public class ClonedTest {
    public static void main(String... args) {
        try {

            List<String> lll = new ArrayList<String>();
            lll.add("");
            String[] objects1 = (String[]) lll.toArray();
            List<? extends Object> a = new ArrayList<String>();
            Object c = new Cloned().clone();
            System.out.println(c);
            Object[] o = new Object[10];
            Object[] clonedO = o.clone();
            System.out.println(o == clonedO);
            System.out.println(o.equals(clonedO));
            System.out.println(1000 >>> 5);
            System.out.println(1000 >> 5);

            List<? extends Object> objects = Arrays.asList(o, clonedO);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
