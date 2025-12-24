import java.util.*;

public class Reverse{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		
		String result = "";
		for(int i = s.length()-1; i >= 0; i--) result += s.charAt(i);
		System.out.println(result);
    }
}