import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number : ");
		double num2 = sc.nextDouble();
		
		// calculating result
		double add = num1 + num2;
		double substract = num1 - num2;
		double multiply = num1 * num2;
		double divide = num1 / num2;
		
		// printing the result
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 +  " and " + num2 + " is " + add + ", " + substract + ", " + multiply + " and " + divide);
	}
}