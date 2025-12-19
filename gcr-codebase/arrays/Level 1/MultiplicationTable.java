import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
		// Creating Scanner Object, taking input and initializing array
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int[] arr = new int[10];
		
		// Using a for loop to store the multiplication table in array
		for(int i = 0; i < 10; i++){
			arr[i] = (i+1) * number;
		}
		
		// Printing the table using for loop
		for(int i = 0; i < 10; i++){
			System.out.println(number + " * " + (i+1) + " = " + arr[i]);
		}

		sc.close();
    }
}