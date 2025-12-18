import java.util.Scanner;

public class RocketLaunchCountdown{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter countdown value : ");
		int counter = sc.nextInt();
		
		// Printing the counter and decrementing the value
		while(counter != 0){
			System.out.println(counter--);
		}
		
		sc.close();
	}
}