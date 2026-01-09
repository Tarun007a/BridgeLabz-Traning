package com.artmarketplace;

public class User {
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean deductBalance(double amount) {
        if(walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    public void showBalance() {
        System.out.println(name + " " + walletBalance);
    }
}
 