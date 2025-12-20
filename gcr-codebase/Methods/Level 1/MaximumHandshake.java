import java.util.Scanner;

public class MaximumHandshake{
	// return the number of handshakes taking input number of students
	public static int handshakes(int n){
		return (n * (n - 1)) / 2;
	}
	
	public static void main(String[] args){
		// Creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		// calling the functino to get result and printing result
		int maxHandshakes = handshakes(n);
		System.out.println("The total number of handshakes : " + maxHandshakes);
	}
}