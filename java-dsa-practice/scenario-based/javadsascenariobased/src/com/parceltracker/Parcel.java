package com.parceltracker;

public class Parcel {
	String name;
	int price;
	State currState;
	
	public Parcel(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
