package com.examples.java8;

@FunctionalInterface
public interface AddInterface{

    public void add(int first, int second);

    default void add(int first, int second, int third){
        System.out.println("DEFAULT METHOD");
    }
}
