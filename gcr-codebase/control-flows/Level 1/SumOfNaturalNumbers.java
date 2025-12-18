import java.util.Scanner;

public class SumOfNaturalNumbers{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		// Checking natural number and printing the sum 
		if(n > 0){
			int sum = (n * (n+1))/2;
			System.out.println("The sum of " + n + " natural numbers is " + sum);
		}
		else{
			System.out.println("The number " + n + " is not a natural number");
		}
		
		sc.close();
	}
}