package com.restrauntorderingsystem;

public class DriverClass {
	public static void main(String[] args) {
		FoodItem vegItem = new VegItem("Paneer", "veg", 200, 10);
		FoodItem nonVegItem = new NonVegItem("Fish", "Non-veg", 100, 50);
		
		Order order = new Order();
		order.placeOrder(vegItem, nonVegItem);
		System.out.println(order.getPrice());
	}
}
