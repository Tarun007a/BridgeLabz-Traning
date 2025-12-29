import java.util.Scanner;

public class Recharge{
	public static void main(String[] args){
		// creating scanner class object and taking user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mobile operator JIO/Airtel : ");
		String operator = sc.next();
		System.out.print("Enter amount : ");
		int amount = sc.nextInt();
		
		// using switch case to check operator and show recharges available
		switch(operator){
			// printing recharges for jio
			case "JIO" -> {
				System.out.println("plan 1 : 28 Days | 1GB per day | Unlimited calling | price : 249");
				System.out.println("plan 2 : 86 Days | 2GB per day | Unlimited calling | 5G unlimited | price : 900");
				
				// using while loop to recharge again
				while(true){
					System.out.println("Enter plan you want to select as 1/2/3");
					System.out.print("Enter 0 to exit : ");
					int choice = sc.nextInt();
					if(choice == 0) break;
					if(choice == 1){
						if(amount >= 249){
							amount -= 249;
							System.out.println("Recharge successful your current amount is " + amount);
							System.out.println("Plan benifits 28 Days | 1GB per day | Unlimited calling");
						}
						else{
							System.out.println("Insufficiend balance");
							break;
						}
					}
					else{
						if(amount >= 900){
							amount -= 900;
							System.out.println("Recharge successful your current amount is " + amount);
							System.out.println("Plan benifits 86 Days | 2GB per day | Unlimited calling | 5G unlimited");
						}
						else{
							System.out.println("Insufficiend balance");
							break;
						}
					}
				}
			}
			
			// printing recharges for airtel
			case "Airtel" -> {
				System.out.println("plan 1 : 28 Days | 1GB per day | Unlimited calling | price : 239");
				System.out.println("plan 2 : 90 Days | 1.5GB per day | Unlimited calling | 5G unlimited | price : 1000");
				
				// using while loop to recharge again
				while(true){
					System.out.println("Enter plan you want to select as 1/2/3");
					System.out.print("Enter 0 to exit : ");
					int choice = sc.nextInt();
					if(choice == 0) break;
					if(choice == 1){
						if(amount >= 239){
							amount -= 239;
							System.out.println("Recharge successful your current amount is " + amount);
							System.out.println("Plan benifits 28 Days | 1GB per day | Unlimited calling");
						}
						else{
							System.out.println("Insufficiend balance");
							break;
						}
					}
					else{
						if(amount >= 1000){
							amount -= 1000;
							System.out.println("Recharge successful your current amount is " + amount);
							System.out.println("Plan benifits 90 Days | 1.5GB per day | Unlimited calling | 5G unlimited | price : 1000");
						}
						else{
							System.out.println("Insufficiend balance");
							break;
						}
					}
				}
			}
			
			default ->{
				System.out.println("Enter a valid mobiel operator");
				break;
			}
		}
		System.out.println("Thank you for using  Phone Recharge Simulator");
	}
}