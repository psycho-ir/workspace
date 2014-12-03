package com.sarabadani.practice.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by soroosh on 12/2/14.
 */
public class Program {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(a|b)(ab)\\p{Alpha}*");
        Matcher matcher = p.matcher("aab");
        System.out.println(matcher.matches());
        System.out.println(matcher.groupCount());
        System.out.println(matcher.group());
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(2));
//        System.out.println(Arrays.toString(Package.getPackages()));
    }
}
