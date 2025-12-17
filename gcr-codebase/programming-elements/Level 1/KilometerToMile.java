import java.util.Scanner;

public class KilometerToMile{
	public static void main(String[] args){
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kilometers : ");
		// taking input kilometers
		double kilometers = sc.nextDouble();
		
		// calculating the distance in miles
		double miles = kilometers * 0.621371;
		
		System.out.print("The total miles is " + miles + " mile for the given "+ kilometers + "km");
	}
}