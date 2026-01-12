package com.traincompanion;

public class DriverClass {
	public static void main(String[] args) {
		NavigationSystem system = new NavigationSystem();
		
		system.addCompartment("wi-fi");
		system.addCompartment("Ticket counter");
		system.addCompartment("pantry");
		system.addCompartment("Waiting room");
		
		system.showAdjecentCompartment();
		System.out.println();
		system.moveToNext();
		System.out.println();
		
		system.showAdjecentCompartment();
		System.out.println();
		system.moveToNext();
		System.out.println();
		
		system.showAdjecentCompartment();
		System.out.println();
		system.moveToPrevious();
		System.out.println();
		
		system.showAdjecentCompartment();
	}
}
