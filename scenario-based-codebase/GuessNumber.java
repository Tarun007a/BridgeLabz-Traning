import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		int lo = 0;
		int hi = 100;
		// finding the random number
		int number = (int) (Math.random() * 100) + 1;
		int chances = 5;
		
		// using do while loop to take user number and checking using if else 
		do{
			System.out.print("Enter the number you gussed : ");
			int choice = sc.nextInt();
			if(choice == number){
				System.out.println("You gussed the correct number");
				return;
			}
			else if(choice < number) System.out.println("Too low");
			else System.out.println("Too high");
			chances--;
		}while(chances > 0);
		
		// printing the correct number
		System.out.println("The correct number is : " + number);
	}
}