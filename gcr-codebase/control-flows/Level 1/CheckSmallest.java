import java.util.Scanner;

public class CheckSmallest{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		int num3 = sc.nextInt();
		
		// Checking smallest and printing the result
		if(num1 < num2 && num1 < num3) System.out.println("The number first is smallest");
		else System.out.println("The number first is not smallest");
		
		sc.close();
	}
}