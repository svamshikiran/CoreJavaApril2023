package com.examples.oops;
//Sub class
public class ScientificCalculator extends Calculator { //Super class or Base class

    public ScientificCalculator(){
        System.out.println("THIS IS SCIENTIFIC CALCULATOR CONSTRUCTOR");
    }

    // <access_specifier> <return_type> <name of the method>(<input parameters>)

    public double sinValue(double angle){//method signature
        return Math.sin(angle); // method body / definition
    }

    private double cosValue(double angle){
        return Math.cos(angle);
    }

    protected double tanValue(double angle){
        return Math.tan(angle);
    }
    //Method Overriding
    // It occurs in Super class/Sub class
    // Method signature is exactly same
    public double divide(double first, double second){
        if(second == 0){
            System.out.println("SECOND VARIABLE IS ZERO, PLEASE CHECK AND TRY AGAIN");
            return 0;
        }
        return first / second;
    }
}
