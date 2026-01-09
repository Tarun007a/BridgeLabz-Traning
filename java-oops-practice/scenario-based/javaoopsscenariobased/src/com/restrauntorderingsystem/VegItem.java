package com.restrauntorderingsystem;

public class VegItem extends FoodItem{
	public VegItem(String name, String category, double price, int availability) {
		super(name, category, price, availability);
	}

	public double getTotal() {
		return price * 0.9;
	}
}
