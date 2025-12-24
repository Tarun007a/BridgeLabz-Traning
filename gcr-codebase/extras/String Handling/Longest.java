import java.util.*;

public class Longest{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.nextLine();
		
		// using split method to split and then finding the longest word
		String[] words = s.split(" ");
		int max = 0;
		String result = words[0];
		
		for(String word : words){
			if(word.length() > max){
				max = word.length();
				result = word;
			}
		}
		System.out.println("Longest word is " + result);
    }
}