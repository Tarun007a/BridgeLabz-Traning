package com.tourmate;

public abstract class Trip implements IBookable{
	public String destination; 
	public double budget;
	public int duration;
	private double hotel;
	private double transport;
	private double activity;
	
	public double getBudget() {
		return budget;
	}

	public void setTransport(double transport) {
		this.transport = transport;
	}
	
	public double getTransport() {
		return this.transport;
	}

	public double getHotel() {
		return hotel;
	}

	public void setHotel(double hotel) {
		this.hotel = hotel;
	}

	public double getActivity() {
		return activity;
	}

	public void setActivity(double activity) {
		this.activity = activity;
	}

	public Trip(String destination, int duration) {
		this.destination = destination;
		this.duration = duration;
	}
	
	public void cancel() {
		System.out.println("Trip canclled!");
	}
	
	public double book() {
		budget = hotel + transport + activity;
		return budget;
	}
}
