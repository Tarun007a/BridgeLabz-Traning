package com.constructor.level1;

public class CarRent {
	private String customerName;
	private String carModel;
	private int rentalDays;
	
	public CarRent(String customerName, String carModel, int rentalDays) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	public int getTotalPrice(){
		return this.rentalDays * 100;
	}
	public static void main(String[] args) {
		CarRent car = new CarRent("Customer1", "Model1", 10);
		System.out.println(car.getTotalPrice());
	}
}
