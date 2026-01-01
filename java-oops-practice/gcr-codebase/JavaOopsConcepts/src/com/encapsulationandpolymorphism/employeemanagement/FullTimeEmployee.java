package com.encapsulationandpolymorphism.employeemanagement;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(int employeeId, String name) {
		super(employeeId, name, 100000);
	}
	
	public int calculateSalary() {
		return 100000;
	}
}
