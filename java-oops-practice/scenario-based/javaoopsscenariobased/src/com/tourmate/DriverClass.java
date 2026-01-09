package com.tourmate;

public class DriverClass {
	public static void main(String[] args) {
		Trip domesticTrip = new DomesticTrip("J&k");
		Trip internationTrip = new InternationalTrip("Dubai");
		
		domesticTrip.book();
		internationTrip.book();
		
		System.out.println(domesticTrip.budget);
		System.out.println(internationTrip.budget);
		
		internationTrip.cancel();
	}
}
