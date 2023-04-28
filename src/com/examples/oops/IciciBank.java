package com.examples.oops;

public class IciciBank implements BankInterface{
    @Override
    public void createAccount() {
        System.out.println("CREATING THE ACCOUNT");
    }

    @Override
    public double getAccountBalance(String accountNumber) {
        System.out.println("GETTING THE ACCOUNT BALANCE");
        return 0;
    }
}
