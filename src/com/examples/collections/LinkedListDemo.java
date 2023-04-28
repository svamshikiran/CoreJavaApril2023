package com.examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> llist = new LinkedList();

        llist.add(12);
        llist.add(34);
        llist.add(21);
        llist.add(9);
        llist.add(55);

        llist.add(2, 98);

        llist.remove(4);

        llist.forEach(value -> {
            System.out.println("VALUE: " + value);
           });
    }
}
