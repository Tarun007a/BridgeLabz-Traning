package com.hospitalqueue;

public class Patient {
	String name;
	int criticality;
	
	public String toString() {
		return name + " " + criticality;
	}
	
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}
}
