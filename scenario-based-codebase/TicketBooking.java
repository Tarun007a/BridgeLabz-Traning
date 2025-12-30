import java.util.*;

/* 14. Movie Ticket Booking App 🎬
 Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names. */


public class TicketBooking{
	public static void main(String[] args){
		// Creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		int totalTicket = 10;
		
		// using infinite while loop for multiple customer
		while(totalTicket-- > 0){
			System.out.print("Enter movie type Action / Comedy / Romance : ");
			String movieType = sc.next();
			System.out.print("Enter seat type Gold / Silver : ");
			String seatType = sc.next();
			
			// switch case to check multiple conditions
			switch(movieType){
				case("Action") -> {
					if(seatType.equals("Gold")){
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 150;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
					else{
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 120;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
				}
			
				case("Comedy") -> {
					if(seatType.equals("Gold")){
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 150;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
					else{
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 100;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
				}
			
				case("Romance") -> {
					if(seatType.equals("Gold")){
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 200;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
					else{
						System.out.print("Do you want snak Y/N : ");
						char choice = sc.next().charAt(0);
						int price = 150;
						if(choice == 'Y') price += 50;
						System.out.println("Your total bill is " + price);
					}
				}
			
				default -> System.out.println("Enter a valid movie type.");
			}
		}
		System.out.println("Tickets are sold out");
	}
}