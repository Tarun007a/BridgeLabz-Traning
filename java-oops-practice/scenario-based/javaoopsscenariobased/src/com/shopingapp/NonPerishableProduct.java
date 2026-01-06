package com.shopingapp;

public class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    public double getDiscount(double amount) {
        return amount * 0.05;
    }
}

