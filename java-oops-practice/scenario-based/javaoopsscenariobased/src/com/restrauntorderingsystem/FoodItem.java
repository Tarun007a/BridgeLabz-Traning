package com.restrauntorderingsystem;

public abstract class FoodItem {
	public String name;
	public String category;
	public double price;
	private int availability;
	
	public FoodItem(String name, String category, double price, int availability) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}

	public int getAvailability() {
		return availability;
	}
	
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	abstract public double getTotal();
}
