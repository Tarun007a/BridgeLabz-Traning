package bankingsystem;

public class Employee extends Person{
	public int empId;
	public Employee(String name, int age, int empId){
		super(name, age);
		this.empId = empId;
	}
}