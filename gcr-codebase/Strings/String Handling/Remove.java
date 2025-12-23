import java.util.*;

public class Remove{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		System.out.print("Enter char to remove : ");
		char toRemove = sc.next().charAt(0);
		String result = "";
		
		// using for loop to iterate and remove char
		for(char ch : s.toCharArray()){
			if(ch != toRemove) result += ch;
		}
		
		System.out.println("The resultatn string is " + result);
		sc.close();
    }
}
