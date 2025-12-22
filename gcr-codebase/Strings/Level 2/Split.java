import java.util.*;

public class Length{
	// method to find length of string
	private static int getLength(String s){
		int idx = 0;
		try{
			while(true){
				char ch = s.charAt(idx);
				idx++;
			}
		}
		catch(Exception e){
			return idx;
		}
	}
	
	// split the string and return an array
	private static String[] split(String s){
		int count = 1;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' ') count++; 
		}
		String[] result = new String[count];
		int idx = 0;
		int prev = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				result[idx++] = s.substring(prev, i);
				prev = i+1;
			}
		}
		result[idx] = s.substring(prev);
		return result;
	}
	
	// compare two strings array
	private static boolean compare(String[] arr1, String[] arr2){
		int n = arr1.length;
		int m = arr2.length;
		
		if(n != m) return false;
		
		for(int i = 0; i < n; i++){
			if(!arr1[i].equals(arr2[i])) return false; 
		}
		return true;
	}
	
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.nextLine().trim();
		
		// calling method and printing result
		String[] arr1 = split(s);
		String[] arr2 = s.split(" ");
		System.out.println(compare(arr1, arr2));
		
		sc.close();
	}
}