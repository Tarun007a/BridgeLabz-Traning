package com.shopingapp;

public class DriverClass {
    public static void main(String[] args) {
        Product p1 = new PerishableProduct("Product 1", 500);
        Product p2 = new NonPerishableProduct("Product 2", 1000);

        Cart cart = new Cart();

        cart.addProduct(p1, 2);
        cart.addProduct(p2, 1);

        cart.generateBill();
    }
}

