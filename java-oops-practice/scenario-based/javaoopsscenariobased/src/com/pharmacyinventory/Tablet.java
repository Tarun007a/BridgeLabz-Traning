package com.pharmacyinventory;

import java.time.LocalDate;

public class Tablet extends Medicine{

	public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	public Tablet(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
	}

	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now());
	}
}
