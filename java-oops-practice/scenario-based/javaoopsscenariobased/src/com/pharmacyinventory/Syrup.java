package com.pharmacyinventory;

import java.time.LocalDate;

public class Syrup extends Medicine{

	public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	public Syrup(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
	}

	public boolean checkExpiry() {
		return expiryDate.isAfter(LocalDate.now().minusDays(5));
	}
}
