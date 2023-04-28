package com.examples.collections;

import com.examples.oops.Calculator;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();

        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(21);
        arrayList.add(9);
        arrayList.add(55);

        arrayList.add(2, 98);

        arrayList.remove(4);

        arrayList.forEach(value-> {
            System.out.println("VALUE: " + value);
            ;

            ;

        });


    }
}
