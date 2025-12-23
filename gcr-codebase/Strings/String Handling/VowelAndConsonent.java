import java.util.*;

public class VowelAndConsonent{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		
		// using for loop to iterate and checking vowel or consonent
		int vowel = 0;
		int consonent = 0;
		for(char ch : s.toCharArray()){
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowel++;
			else consonent++;
		}
		System.out.println("Vowel count : " + vowel + " " + "consonent count : " + consonent);
    }
}