import java.util.Scanner;

public class TrainReservation{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		// initializing seats
		int acSeats = 10;
		int sleeperSeats = 10;
		int generalSeats = 10;
		
		// using infinite while loop
		while(true){
			// giving choices and taking input
			System.out.println("Enter 1 to check availability");
			System.out.println("Enter 2 to book ac seat");
			System.out.println("Enter 3 to book sleeper seat");
			System.out.println("Enter 4 to book general seat");
			System.out.println("Enter 0 to exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			// using switch case and handelling each case
			switch(choice){
				case(1) -> {
					System.out.println("The ac seats available are " + acSeats);
					System.out.println("The sleeper seats available are " + sleeperSeats);
					System.out.println("The general seats available are " + generalSeats);
				}
				
				case(2) -> {
					if(acSeats == 0){
						System.out.println("Ac seats are full");
						return;
					}
					System.out.println("Ticker booked successfully, your seat number is " + acSeats);
					acSeats--;
				}
				
				case(3) -> {
					if(sleeperSeats == 0){
						System.out.println("Sleeper seats are full");
						return;
					}
					System.out.println("Ticker booked successfully, your seat number is " + sleeperSeats);
					sleeperSeats--;
				}
				
				case(4) -> {
					if(generalSeats == 0){
						System.out.println("General seats seats are full");
						return;
					}
					System.out.println("Ticker booked successfully, your seat number is " + generalSeats);
					generalSeats--;
				}
				
				case(0) -> {
					System.out.println("Thank you for using Train Reservation System");
					return;
				}
				
				default -> System.out.println("Enter a valid choice");
			}
		}
	}
}