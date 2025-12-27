package com.constructor.level1;

public class Circle {
	private int radius;
	
	public Circle() {
		this.radius = 10;
	}
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
	}
}
