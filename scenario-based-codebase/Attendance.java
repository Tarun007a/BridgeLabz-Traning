import java.util.Scanner;

public class Attendacen {
	public static void main(String[] args){
		// creating scanner class object and taking user input
		Scanner sc = new Scanner(System.in);
		int n = 10;
		String[] students = new String[n];
		int present = 0;
		
		// taking students name input
		for(int i = 0; i < n; i++){
			System.out.print("Enter the name of student : ");
			students[i] = sc.nextLine();
		}
		
		// marking attendance of students
		System.out.println("Enter yes if student is present otherwise enter no");
		for(int i = 0; i < n; i++){
			System.out.print(students[i] + " ");
			String input = sc.next();
			if(input.equals("yes")) present++;
		}
		
		// priting results
		System.out.println("Total " + present + " students are present among the 10 students");
	}
}