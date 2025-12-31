import java.util.Scanner;

public class LuckyDraw{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		
		// using infinite while loop
		while(true){
			System.out.print("Enter a number : ");
			String s = sc.next();
			try{
				int n = Integer.parseInt(s);
				if(n%3 == 0 && n%5 == 0) System.out.println("You won a gift");
				else System.out.println("Better luck next time");
			}
			catch(Exception e){
				System.out.println("Enter a valid number");
			}
			System.out.print("Do you want to continue? Y/N : ");
			if(sc.next().charAt(0) == 'N') break;
		}
	}
}