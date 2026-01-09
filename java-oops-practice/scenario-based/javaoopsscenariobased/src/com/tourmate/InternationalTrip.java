package com.tourmate;

public class InternationalTrip extends Trip{
	public InternationalTrip(String destination) {
		super(destination, 40);
		super.setTransport(10000);
		super.setHotel(50000);
		super.setActivity(50000);
	}
}
