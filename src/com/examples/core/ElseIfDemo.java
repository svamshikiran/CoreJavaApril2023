package com.examples.core;

public class ElseIfDemo {

    public static void main(String[] args) {

        int number = 25;

        int reminder = number % 2;
        //Conditional Operator == != > < <= >=
        if(reminder == 0){
            System.out.println("THE NUMBER IS EVEN");
        }
        else
        {
            System.out.println("THE NUMBER IS ODD");
        }
    }
}
