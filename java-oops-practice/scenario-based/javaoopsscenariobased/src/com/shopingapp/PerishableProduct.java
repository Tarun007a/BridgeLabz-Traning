package com.shopingapp;

public class PerishableProduct extends Product {
    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    public double getDiscount(double amount) {
        return amount * 0.10;
    }
}
