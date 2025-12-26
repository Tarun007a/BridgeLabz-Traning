import java.util.Scanner;

public class ElectionManager{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		while(true){
			System.out.print("Enter use age : ");
			int age = sc.nextInt();
			if(age == -1) break;
			if(age >= 18){
				System.out.print("Enter candidate to vote 1/2/3 : ");
				int candidate = sc.nextInt();
				if(candidate == 1) c1++;
				else if(candidate == 2) c2++;
				else if(candidate == 3) c3++;
			}
			else System.out.println("You cannnot vote" );
		}
		System.out.print("candidate 1 : " + c1 + ", candidate 2 : " + c2 + " and candidate 3 : " + c3);
		sc.close();
	}
}