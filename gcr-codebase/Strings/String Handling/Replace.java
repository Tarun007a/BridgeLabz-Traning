import java.util.*;

public class Replace{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.nextLine();
		System.out.print("Enter word to remove : ");
		String remove = sc.next();
		String result = "";
		
		// using split to split in word and the creating result
		for(String str : s.split(" ")){
			if(!str.equals(remove)) result += " " + str;
		}
		
		System.out.println("The resultatn string is " + result);
		sc.close();
    }
}
