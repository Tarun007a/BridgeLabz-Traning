package com.restrauntorderingsystem;

import java.util.*;

public class Order implements IOrderable{
	public List<FoodItem> items;
	public double total;
	
	public Order() {
		items = new ArrayList<>();
	}

	public void cancelOrder() {
		System.out.println("Order cancelled!");
	}

	public void placeOrder(FoodItem... foodItems) {
		for(FoodItem foodItem : foodItems) {
			if(foodItem.getAvailability() == 0) {
				System.out.println("Item not available");
				items = new ArrayList<FoodItem>();
				total = 0;
				return;
			}
			items.add(foodItem);
		}
	}
	
	public double getPrice() {
		double result = 0;
		for(FoodItem foodItem : items) result += foodItem.getTotal();
		return result;
	}
}
