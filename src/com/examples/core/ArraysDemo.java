package com.examples.core;

public class ArraysDemo {

    public static void main(String[] args) {

        int marks[] = {95, 98, 99, 93, 90, 94};

        int total = 0;
        int position = 0;

        while(position < marks.length){
            total = total + marks[position];
            position++;
        }

        System.out.println("TOTAL MARKS: "+total);
        System.out.println("AVERAGE: "+ ((double)total)/6);
    }
}
