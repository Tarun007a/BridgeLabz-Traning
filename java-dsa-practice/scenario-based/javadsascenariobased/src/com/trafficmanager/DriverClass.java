package com.trafficmanager;

public class DriverClass {
	public static void main(String[] args) {
		TrafficManager manager = new TrafficManager(100);
		manager.addInQueue(0, "Vehicle1");
		manager.addInQueue(1, "Vehicle2");
		manager.addInQueue(2, "Vehicle3");
		manager.addInQueue(3, "Vehicle4");
		
		manager.addInPath();
		manager.addInPath();
		manager.addInPath();
		manager.addInPath();
		manager.addInPath();
		
		manager.printState();
		
		manager.remove(0);
		manager.remove(3);
		
		manager.printState();
	}
}
