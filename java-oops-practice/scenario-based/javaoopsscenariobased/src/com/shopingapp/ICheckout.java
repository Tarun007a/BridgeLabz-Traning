package com.shopingapp;

public interface ICheckout {
    void generateBill();
    double applyDiscount(Product product, double amount);
}
