package com.examples.core;

import com.examples.oops.ScientificCalculator;

public class CharsAndStrings {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = '+';

        String str = "JAVA PROGRAMMING";

        System.out.println("VALUE: "+str.charAt(8));
        System.out.println("VALUE: "+str.replace('A', 'a'));
        System.out.println("VALUE: "+str.substring(4, 8));

    }
}
