package com.shopingapp;

public class Cart implements ICheckout {
    private Product[] products;
    private int[] quantity;
    private int count;
    private double totalPrice;

    public Cart() {
        products = new Product[10];
        quantity = new int[10];
        count = 0;
        totalPrice = 0;
    }

    public Cart(Product product, int qty) {
        this();
        addProduct(product, qty);
    }

    public void addProduct(Product product, int qty) {
        products[count] = product;
        quantity[count] = qty;
        totalPrice += product.getPrice() * qty;
        count++;
    }

    public void generateBill() {
        double finalAmount = totalPrice;
        
        for(int i = 0; i < count; i++) {
            double itemTotal = products[i].getPrice() * quantity[i];
            finalAmount -= applyDiscount(products[i], itemTotal);
        }
        
        System.out.println(totalPrice + " " + finalAmount);
    }

    public double applyDiscount(Product product, double amount) {
        return product.getDiscount(amount);
    }
}

