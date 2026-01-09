package com.tourmate;

public class DomesticTrip extends Trip{
	public DomesticTrip(String destination) {
		super(destination, 20);
		super.setTransport(1000);
		super.setHotel(5000);
		super.setActivity(10000);
	}
}
