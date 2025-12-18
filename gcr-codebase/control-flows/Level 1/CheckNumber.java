import java.util.Scanner;

public class CheckNumber{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		// Checking number and printing result
		if(number > 0){
			System.out.println("The number is positive");
		}
		else if(number == 0){
			System.out.println("The number is zero");
		}
		else{
			System.out.println("The number is negative");
		}
		
		sc.close();
	}
}