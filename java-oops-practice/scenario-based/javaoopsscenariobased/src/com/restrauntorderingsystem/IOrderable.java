package com.restrauntorderingsystem;

public interface IOrderable {
	void placeOrder(FoodItem... foodItems);
	void cancelOrder();
}
