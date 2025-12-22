import java.util.Scanner;

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
	public static void main(String[] args){
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.next();
		
		// calling method and printing result
		System.out.println("Length using user defined method : " + getLength(s) +  " and Length using inbuilt method : " + s.length());
		
		sc.close();
	}
}