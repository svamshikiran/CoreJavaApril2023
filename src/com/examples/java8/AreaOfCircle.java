package com.examples.java8;

public class AreaOfCircle {

    public static final double VALUE_OF_PI = 3.14;//final keyword for all constants

    public double area(double radius){
        return VALUE_OF_PI * radius * radius;
    }

    public double circumference(double radius){
        return 2 * VALUE_OF_PI * radius;
    }
}
