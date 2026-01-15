package com.eventmanager;

public class Ticket {
	double price;
	String type;
	
	public Ticket(String type, double price) {
		this.price = price;
		this.type = type;
	}
	
	public String toString() {
		return type + " " + price;
	}
}
