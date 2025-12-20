import java.util.Scanner;

public class SimpleInterest{
	// return simple interest by taking input
	public static double calculateSI(double principal, double rate, double time){
		return (principal * rate * time) / 100.0;
	}
	public static void main(String[] args){
		// Creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount : ");
		double principal = sc.nextDouble();
		System.out.print("Enter rate of interest : ");
		double rate = sc.nextDouble();
		System.out.print("Enter time in years : ");
		double time = sc.nextDouble();
		
		// calling the functino to get result and printing result
		double si = calculateSI(principal, rate, time);
		System.out.println("The simple interest is : " + si);
	}
}