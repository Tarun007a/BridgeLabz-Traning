import java.util.Scanner;

/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout. */


public class QuizApp{
	public static void main(String[] args){
		// creating scanner class object and initializing variable
		Scanner sc = new Scanner(System.in);
		int total = 0;
		boolean[] isCorrect = new boolean[5];
		int[] correct = {'C', 'C', 'A', 'B', 'C'};
		
		// printing the questions
		System.out.println("1. Which component of Java is responsible for converting bytecode into machine-specific code?\nA) JDK\nB) JRE\nC) JVM\n\n2. Which of the following is NOT a feature of Java?\nA) Platform Independent\nB) Object-Oriented\nC) Pointer-based\n\n3. What is the default value of an instance variable in Java?\nA) Depends on data type\nB) Garbage value\nC) Zero\n\n4. Which keyword is used to prevent method overriding in Java?\nA) static\nB) final\nC) private\n\n5. Which collection does NOT allow duplicate elements?\nA) List\nB) ArrayList\nC) Set\n");
		
		// using for loop for 5 questions
		for(int i = 0; i < 5; i++){
			System.out.print ("Enter option for question " + (i+1) + " : ");
			char choice = sc.next().charAt(0);
			
			// using switch case to check option
			switch(choice){
				case 'A' -> {
					if(correct[i] == 'A') isCorrect[i] = true;
				}
				case 'B' -> {
					if(correct[i] == 'B') isCorrect[i] = true;
				}
				case 'C' -> {
					if(correct[i] == 'C') isCorrect[i] = true;
				}
				default -> {
					System.out.println("Invalid choice enter a valid option A/B/C");
					i--;
				}
			}
		}
		
		// calculating the total score
		for(boolean curr : isCorrect) if(curr) total++;
		
		// printing the results
		System.out.println("You scored " + total + " of " + 5);
	}
}