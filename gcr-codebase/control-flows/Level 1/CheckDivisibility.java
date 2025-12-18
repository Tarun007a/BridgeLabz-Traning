import java.util.Scanner;

public class CheckDivisibility{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		// Checking divisibility and printing the result
		if(num % 5 == 0){
			System.out.println("The number " + num + " is divisible by 5");
		}
		else{
			System.out.println("The number " + num + " is not divisible by 5");
		}
	}
}