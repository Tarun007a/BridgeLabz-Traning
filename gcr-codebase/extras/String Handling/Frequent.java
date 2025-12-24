import java.util.*;

public class Frequent{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		int[] freq = new int[256];
		int max = 0;
		char result = 'a';
		
		// using for loop and frequency array to find most frequent array
		for(char ch : s.toCharArray()){
			freq[ch]++;
			if(freq[ch] > max){
				max = freq[ch];
				result = ch;
			}
		}
		
		System.out.println("The most frequent char is " + result);
		sc.close();
    }
}
