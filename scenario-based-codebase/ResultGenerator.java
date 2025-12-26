import java.util.Scanner;

public class FareDeduction{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int[] arr = new int[5];
		int sum = 0;
		char grade;
		
		for(int i = 0; i < 5; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		int avg = sum/50;
		switch(avg){
			case(9):
				grade = 'A';
				break;
			
			case(8):
				grade = 'B';
				break;
			
			case(7):
				grade = 'C';
				break;
			
			case(6):
				grade = 'D';
				break;
			
			default : grade = 'E';
		}
		
		System.out.println("Student grade is : " + grade);
		
		sc.close();
	}
}