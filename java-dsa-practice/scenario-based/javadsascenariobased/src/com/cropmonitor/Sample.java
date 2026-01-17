package com.cropmonitor;

public class Sample {
	int id;
	int temp;
	
	public Sample(int id, int temp) {
		super();
		this.id = id;
		this.temp = temp;
	}
	
	public String toString() {
		return id + " " + temp;
	}
}
