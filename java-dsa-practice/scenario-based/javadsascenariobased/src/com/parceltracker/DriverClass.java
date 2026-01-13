package com.parceltracker;

public class DriverClass {
	public static void main(String[] args) {
		Parcel p1 = new Parcel("Watch", 1000);
		TrackingSystem system = new TrackingSystem(p1);
		system.addState(0, "ordered", p1);
		system.addState(2, "intemidiate state", p1);
		
		system.processParcel(p1);
		
		Parcel p2 = new Parcel("Mobile", 10000);
		TrackingSystem system2 = new TrackingSystem(p2);
		system2.addNull(p2);
		system2.processParcel(p2);
	}
}
