package com.trafficmanager;

public class VehicleNode {
	int id;
	String name;
	VehicleNode next;
	
	public VehicleNode(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
