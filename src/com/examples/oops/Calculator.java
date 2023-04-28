package com.examples.oops;

public class Calculator {

    //Method Overloading
    // Having same method name - logic is different
    // Occurs in the same class
    // Method signatures are different

    public Calculator(){
        System.out.println("THIS IS CALCULATOR CONSTRUCTOR");
    }

    public double add(double first, double second){
        return first + second;
    }

    public double add(double first, double second, double third){
        return first + second + third;
    }

    public double subtract(double first, double second){
        return first - second;
    }

    public double multiply(double first, double second){
        return first * second;
    }

    public double divide(double first, double second){
        return first / second;
    }
}
