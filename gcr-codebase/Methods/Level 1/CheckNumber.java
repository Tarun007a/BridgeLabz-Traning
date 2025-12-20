import java.util.Scanner;

public class CheckNumber{
	// return the -1 for negative, 0 for zero and 1 for positive number
	public static int getNumberSign(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		return 1;
	}
	
	public static void main(String[] args){
		// Creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		// calling the functino to get result, comparing and printing result
		int result = getNumberSign(n);
		if(result == 0) System.out.println("zero");
		else if(result == -1) System.out.println("negative number");
		else System.out.println("positive number");
	}
}