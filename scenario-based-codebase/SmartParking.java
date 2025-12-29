import java.util.Scanner;
import java.util.Arrays;

public class SmartParking{
	// method to park vehicle
	private static int parkInSlot(int idx, int size){
		if(idx == size) {
			System.out.println("The parking is full");
			return -1;
		}
		
		System.out.println("Your car is parked at " + " slot " + (idx+1));
		return idx+1;
	}
	
	// method to print occupancy of slots
	private static void showOccupancy(int idx, int size){
		for(int i = 0; i < size; i++){
			if(i >= idx) System.out.println("slot " + (i+1) + " is empty");
			else System.out.println("slot is " + (i+1) + " full");
		}
	}
	
	public static void main(String[] args){
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// taking input
		System.out.println("Welcome to smart parking");
		System.out.print("Enter the maximum cars to be parked : ");
		int size = sc.nextInt();
		int idx = 0;
		
		// using infinite while loop		
		while(true){
			// taking user input
			System.out.print("Enter 1 for park, 2 for show occupancy, 3 for exit : ");
			int choice = sc.nextInt();
			
			// using switch case
			switch(choice){
				case 1 : 
					idx = parkInSlot(idx, size);
					if(idx == -1) return;
					break;
					
				case 2 : 
					showOccupancy(idx, size);
					break;
					
				case 3 : 
					idx--;
					break;
					
				default : 
					System.out.println("Enter a valid input");
			}
		}
	}
}