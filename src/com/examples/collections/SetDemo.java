package com.examples.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(34);
        set.add(21);
        set.add(9);
        set.add(55);

        set.add(12);

        set.forEach(value -> {
            System.out.println("VALUE: " + value);
        });

        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(12);
        tSet.add(34);
        tSet.add(21);
        tSet.add(9);
        tSet.add(55);

        tSet.forEach(value -> {
            System.out.println("TREE SET VALUE: " + value);
        });
    }
}
