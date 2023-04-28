package com.examples.oops;

public interface BankInterface {

    public void createAccount();

    public double getAccountBalance(String accountNumber);

    default public void createLoanAccount(){
        System.out.println("THIS IS A DEFAULT METHOD");
    }

    static void printLog(String message){
        System.out.println("Printing the log message: "+message);
    }
}
