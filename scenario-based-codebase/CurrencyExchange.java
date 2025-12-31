import java.util.Scanner;

public class CurrencyExchange{
	public static void main(String[] args){
		// creating scanner object and taking user input
		Scanner sc = new Scanner(System.in);
		char ch;
		
		// using do while loop
		do{
			System.out.print("Enter amount : ");
			Double amount = sc.nextDouble();
			System.out.print("Enter currency to exchange USD/EUR/HKD : ");
			String currency = sc.next();
			
			// using switch case
			switch(currency){
				case("USD") -> System.out.println("The amount in USD is " + amount*0.011);
				case("EUR") -> System.out.println("The amount in ERU is " + amount*0.0095);
				case("HKD") -> System.out.println("The amount in HKD is " + amount*0.087);
				default -> System.out.println("Enter a valid currency");
			}
			
			System.out.print("Do you want to continue? Y/N : ");
			ch = sc.next().charAt(0);
		}
		while(ch == 'Y');
		
	}
}