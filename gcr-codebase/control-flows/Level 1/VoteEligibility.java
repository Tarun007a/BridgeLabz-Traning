import java.util.Scanner;

public class VoteEligibility{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		// Checking age and printing eligibility
		if(age >= 18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
		sc.close();
	}
}