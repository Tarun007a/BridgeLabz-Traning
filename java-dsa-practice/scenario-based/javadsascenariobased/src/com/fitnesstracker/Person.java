package com.fitnesstracker;

public class Person {
	String name;
	int steps;
	
	public Person(String name, int steps) {
		this.name = name;
		this.steps = steps;
	}
	
	public String toString() {
		return name + " " + steps;
	}
}
