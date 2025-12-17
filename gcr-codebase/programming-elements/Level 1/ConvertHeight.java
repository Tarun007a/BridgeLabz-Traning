import java.util.Scanner;

public class ConvertHeight{
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height in centimeters : ");
		double heightInCentimeters = sc.nextDouble();

		
		// calculating height is inch and feet
		double heightInInch = 0.3937 * heightInCentimeters;
		double heightInFeet = 0.0328 * heightInCentimeters;
		
		// printing the result
		System.out.println("Your Height in cm is " + heightInCentimeters +  "while in feet is " + heightInFeet +  " and inches is " + heightInInch);
	}
}