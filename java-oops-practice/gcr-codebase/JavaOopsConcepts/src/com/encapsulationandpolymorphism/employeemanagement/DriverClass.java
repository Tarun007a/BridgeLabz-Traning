package com.encapsulationandpolymorphism.employeemanagement;

public class DriverClass {
	public static void main(String[] args) {
		// creating object and calling fucntions
		Employee fullTimeEmp = new FullTimeEmployee(0, "Aman");
		Employee partEmployee = new PartTimeEmployee(1, "Tarun");
		
		fullTimeEmp.assignDepartments("Dev");
		partEmployee.assignDepartments("Deployment");
		
		System.out.println(fullTimeEmp.calculateSalary());
		System.out.println(partEmployee.calculateSalary());
		fullTimeEmp.displayDetails();
		partEmployee.displayDetails();
	}
}
