import java.util.Scanner;

/* 16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut). */
public class StopWatch{
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character to start the stop watch");
		String s = sc.next();
		
		// using nested for loop to print time in hours and minutes
		for(int i = 0; i < 13; i++){
			for(int j = 0; j < 60; j++){
				System.out.println(i + ":" + j);
			}
		}
	}
}