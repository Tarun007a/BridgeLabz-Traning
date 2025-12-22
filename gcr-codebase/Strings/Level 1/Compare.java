import java.util.Scanner;

public class Compare{
	// method to compare strings using the charAt method 
	private static boolean compareStrings(String s1, String s2){
		int n = s1.length();
		int m = s2.length();
		
		// check if size is unequal
		if(n != m) return false;
		
		// using charAt to check equality
		for(int i = 0; i < n; i++){
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		// calling method and printing result
		if(s1.equals(s2) == compareStrings(s1, s2)) System.out.println("Output is same");
		else System.out.println("Output is diffrent");
		
		sc.close();
	}
}