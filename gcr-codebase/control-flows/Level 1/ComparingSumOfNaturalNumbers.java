import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		if(n <= 0){
			System.out.println("The number entered is not a natural number");
		}
		
		// using formula
		int sumUsingFormula = (n * (n+1))/2;
		// using while loop
		int sumUsingWhileLoop = 0;
		int i = 1; 
		while(i <= n){
			sumUsingWhileLoop += i;
			i++;
		}
		
		if(sumUsingFormula == sumUsingWhileLoop){
			System.out.println("Sum is equal using while loop and formula, the sum is " + sumUsingFormula);
		}
		
		sc.close();
	}
}