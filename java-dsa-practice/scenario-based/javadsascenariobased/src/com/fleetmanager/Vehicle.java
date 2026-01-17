package com.fleetmanager;

public class Vehicle {
	int no;
	int mileage;
	
	public Vehicle(int no, int mileage) {
		super();
		this.no = no;
		this.mileage = mileage;
	}
	
	public String toString() {
		return no + " " + mileage;
	}
}
