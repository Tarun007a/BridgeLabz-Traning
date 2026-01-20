package com.eduresults;

public class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return name + " " + marks;
	}
}
