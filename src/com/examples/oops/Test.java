package com.examples.oops;

import com.examples.java8.AreaOfCircle;

public class Test {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        ScientificCalculator sCalc = new ScientificCalculator();

        /*
        double result = sCalc.multiply(23.5, 89.1);//method call - Test (caller)
        System.out.println("RESULT: "+result);

        double tanValue = sCalc.tanValue(45);//method call - Test (caller)
        System.out.println("tan Value: "+tanValue);

        double divideResult = sCalc.divide(45, 0);//method call - Test (caller)
        System.out.println("Division Result: "+divideResult);*/

        AreaOfCircle circleOne = new AreaOfCircle();
        System.out.println("AREA: "+circleOne.area(10));
        System.out.println("CIRCUMFERENCE: "+circleOne.circumference(10));
        System.out.println("Object One - VALUE OF PI: "+AreaOfCircle.VALUE_OF_PI);

        AreaOfCircle circleTwo = new AreaOfCircle();
        System.out.println("Object Two - VALUE OF PI: "+AreaOfCircle.VALUE_OF_PI);

        BankInterface.printLog("SAMPLE PRINTING");
    }
}
