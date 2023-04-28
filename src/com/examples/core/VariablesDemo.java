package com.examples.core;

public class VariablesDemo {

    public static void main(String[] args) {
        // VARIABLE DATATYPES
            // int, short, long - integers/numbers
            // double - decimal numbers
            // boolean - true or false
            //char, String - characters/symbols + * A a ' "Java Program"

        //Variable Initialization
        int firstNumber;
        int secondNumber;
        double result;

        firstNumber = 20;
        secondNumber = 8;

        //Arithematics Operators + - * / %

        result = firstNumber + secondNumber;
        System.out.println("ADDITION RESULT: "+result);

        result = firstNumber - secondNumber;
        System.out.println("SUBTRACTION RESULT: "+result);

        result = firstNumber * secondNumber;
        System.out.println("MULTIPLICATION RESULT: "+result);

        result = (double)firstNumber / secondNumber; //Type Casting
        System.out.println("DIVISION RESULT: "+result);

        result = firstNumber % secondNumber;
        System.out.println("MODULUS RESULT: "+result);
    }
}
