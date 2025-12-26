package com.classandobject.level1;

public class Circle {
	//non-static variables
	double radius;
	
	//constructors
	Circle(double radius){
		this.radius=radius;
	}
	
	//Creating method for calculating area of circle
	public void areaCircle() {
		System.out.println("Area of circle: " + (Math.PI*radius*radius));
	}
	
	//Creating method for calculating circumference of circle
	public void circumferenceCircle() {
		System.out.println("Circumference of circle: " + (2*Math.PI*radius));
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(2.5);//constructor invoke
		circle.areaCircle();//area method calling
	
		circle.circumferenceCircle();//circumference method calling
	}
}
