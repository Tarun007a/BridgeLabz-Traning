import java.util.Scanner;

public class CountdownUsingForLoop{
	public static void main(String[] args){
		// creating scanner object and taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter countdown value : ");
		int counter = sc.nextInt();
		
		// Printing the counter using for loop
		for(; counter >= 1; counter--){
			System.out.println(counter);
		}
		
		sc.close();
	}
}