import java.util.Scanner;

public class BusRoute{
	public static void main(String[] args){
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		char ch = 'N';
		int stop = 1;
		int totalDistance = 0;
		
		// using while loop
		while(ch == 'N'){
			totalDistance += 10;
			System.out.print("Do you want to exit at stop " + stop + "? Y/N : ");
			ch = sc.next().charAt(0);
			stop++;
		}
		
		// printing results
		System.out.println("You travelled " + totalDistance + "KM, your total cost is " + totalDistance*10);
	}
}