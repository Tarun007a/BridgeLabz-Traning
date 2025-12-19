import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		
		// taking input in array using a loop
		for(int i = 0; i < age.length; i++){
			System.out.print("Enter age of student : ");
			age[i] = sc.nextInt();
		}
		
		// Checking age and printing eligibility using a for loop
		for(int i = 0; i < age.length; i++){
			if(age[i] <= 0) System.out.println("Invalid age");
			else if(age[i] < 18) System.out.println("The student with the age " + age[i] + " cannot vote.");
			else System.out.println("The student with the age " + age[i] + " can vote.");
		}

		sc.close();
    }
}