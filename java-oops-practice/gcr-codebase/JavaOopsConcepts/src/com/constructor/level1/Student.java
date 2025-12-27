package com.constructor.level1;

public class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	// getter to get cgpa
	public double getCgpa() {
		return CGPA;
	}
	
	// setter for cgpa
	public void setCgpa(double cgpa) {
		this.CGPA = cgpa;
	}
}
