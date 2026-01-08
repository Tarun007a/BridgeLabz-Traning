package com.pharmacyinventory;

public interface ISellable {
    double sell(int quantity);
    boolean checkExpiry();
}
