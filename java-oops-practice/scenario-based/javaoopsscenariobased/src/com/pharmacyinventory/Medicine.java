package com.pharmacyinventory;

import java.time.LocalDate;

public abstract class Medicine implements ISellable{
	public String name;
	private double price;
	public LocalDate expiryDate;
	private int quantity;
	
	public Medicine(String name, double price, LocalDate expiryDate) {
		this.price = price;
		this.name = name;
		this.expiryDate = expiryDate;
		this.quantity = 10;
	}
	
	public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
		this.price = price;
		this.name = name;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private double getDiscount(int quantity) {
		if(quantity > 10) return price * 0.2;
		return price * 0.1;
	}
	
	public double sell(int quantity) {
		if(!checkExpiry() || this.quantity < quantity) return -1;
		return quantity * price - getDiscount(quantity);
	}
}
