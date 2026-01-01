package com.inheritance.hierarchialinheritance.backaccount;

public class CheckingAccount extends BankAccount {
    public double withdrawalLimit;

    // constructor
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // display
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}