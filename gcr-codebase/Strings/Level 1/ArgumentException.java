import java.util.Scanner;

public class ArgumentException{
	// method to generate illegal argument exception
	private static void generateException(String s) throws IllegalArgumentException{
		s.substring(s.length()+110);
	}
	
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String txt = sc.next();
		
		try{
			generateException(txt);
		}
		catch(IllegalArgumentException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}