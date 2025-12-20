import java.util.Scanner;

public class Rounds{
	// return the number of rounds required and taking input sides of triangle
	public static double findRounds(double s1, double s2, double s3){
		return 5/(s1 + s2 + s3);
	}
	
	public static void main(String[] args){
		// Creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 sides of triangle : ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		// calling the functino to get result and printing result
		double requiredRounds = findRounds(side1, side2, side3);
		System.out.println("The total number of rounds to complete 5 km are " + requiredRounds);
	}
}