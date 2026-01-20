package com.flashdealz;

public class Product {
	String name;
	double discount;
	
	public Product(String name, double discout) {
		this.name = name;
		this.discount = discout;
	}
	
	public String toString() {
		return name + " " + discount;
	}
}
