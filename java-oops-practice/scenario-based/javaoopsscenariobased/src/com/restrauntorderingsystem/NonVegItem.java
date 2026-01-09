package com.restrauntorderingsystem;

public class NonVegItem extends FoodItem{

	public NonVegItem(String name, String category, double price, int availability) {
		super(name, category, price, availability);
	}

	public double getTotal() {
		return price * 0.95;
	}
}
