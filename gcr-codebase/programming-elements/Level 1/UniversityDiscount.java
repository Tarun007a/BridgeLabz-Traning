import java.util.Scanner;
public class UniversityDiscount{
	public static void main(String[] args){
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your fees : ");
		// taking input fees
		double fees = sc.nextDouble();
		System.out.print("Enter discount percentage : ");
		double discountPercentage = sc.nextDouble();
		
		// calculating discount and discounted price
		double discount = (fees/100)*discountPercentage;
		double discountedAmount = fees - discount;
		
		// printing the result
		System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + discountedAmount);
	}
}