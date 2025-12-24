import java.util.*;

public class Duplicates{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		
		// useing an array to check and creating a new string with no duplicates
		boolean[] isPresent = new boolean[256];
		String result = "";
		for(char ch : s.toCharArray()){
			if(!isPresent[ch]){
				isPresent[ch] = true;
				result += ch;
			}
		}
		System.out.println("String with no duplicates : " + result);
    }
}