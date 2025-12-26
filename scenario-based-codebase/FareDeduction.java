import java.util.Scanner;

public class FareDeduction{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Fare per km is 10, enter -1 distance to eixt");
		System.out.print("Enter balance : ");
		int balance = sc.nextInt(); 
		
		while(true){
			System.out.print("Enter distance : ");
			int distance = sc.nextInt();
			int cost = distance * 10;
			if(cost > balance){
				System.out.println("Insufficient amount");
				break;
			}
			balance -= cost;
		}
		sc.close();
	}
}