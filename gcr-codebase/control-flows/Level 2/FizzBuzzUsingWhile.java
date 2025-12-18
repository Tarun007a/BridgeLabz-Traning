import java.util.Scanner;
public class FizzBuzzFor {

    public static void main(String[] args) {
        // Creatint Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        int number = sc.nextInt();
		int i = 1;
		
		// check input is positive
		if(number <= 0){
			System.out.println("Enter a positive number");
			return;
		}

		// using while loop, checking multiple and printing output
        while (i <= number) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
				System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
			i++;
        }
    }
}