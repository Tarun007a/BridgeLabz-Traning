import java.util.Scanner;

public class IndexException{
	// method to generate index out of bound exception
	private static void generateException(String s) throws IndexOutOfBoundsException{
		s.charAt(s.length());
	}
	
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String txt = sc.next();
		
		// using try catch to handle exception
		try{
			generateException(txt);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}