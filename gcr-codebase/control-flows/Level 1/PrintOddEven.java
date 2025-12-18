import java.util.Scanner;

public class PrintOddEven{
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		// Checking input
		if(number <= 0){
			System.out.println("Enter a positive number ");
			return;
		}
		// Printing the numbers 
		for(int i = 1; i <= number; i++){
			if(i%2 == 0){
				System.out.println("The number " + i + " is Even.");
			}
			else{
				System.out.println("The number " + i + " is Odd.");
			}
		}
		
		sc.close();
	}
}