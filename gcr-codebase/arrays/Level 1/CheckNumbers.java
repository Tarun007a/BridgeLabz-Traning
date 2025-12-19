import java.util.Scanner;

public class CheckNumbers{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		// taking input in array using a loop
		for(int i = 0; i < arr.length; i++){
			System.out.print("Enter number : ");
			arr[i] = sc.nextInt();
		}
		
		// Checking the number is positive, negative or zero
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 0) System.out.println("Negative");
			else if(arr[i] == 0) System.out.println("Zero");
			else {
				if(arr[i]%2 == 0) System.out.println("Even number");
				else System.out.println("Odd number");
			}
		}
		
		// Equating first and last numbers
		if(arr[0] == arr[4]) System.out.println("First and last numbers are equal");
		else if(arr[0] > arr[4]) System.out.println("First number is greater than last number");
		else System.out.println("Last number is greater than First");

		sc.close();
    }
}