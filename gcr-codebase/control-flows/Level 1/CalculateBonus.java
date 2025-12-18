import java.util.Scanner;

public class CalculateBonus{
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter year of experience : ");
		int yearOfExperience = sc.nextInt();
		
		//calculating the bonus
		int bonus = 0;
		if(yearOfExperience >= 5) bonus = (salary/100)*5;
		
		// printing the results
		System.out.println("The bonus amount is : " + bonus);
		
		sc.close();
	}
}