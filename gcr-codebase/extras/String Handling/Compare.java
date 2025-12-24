import java.util.*;

public class Compare{
    public static void main(String[] args) {
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
		String s1 = sc.next();
		System.out.print("Enter string 2 : ");
		String s2 = sc.next();
		int n = s1.length();
		int m = s2.length();
		int smallest = n < m ? 0 : 1;
		
		for(int i = 0; i < Math.min(n, m); i++){
			if(s1.charAt(i) < s2.charAt(i)){
				smallest = 0;
				break;
			}
			else if(s1.charAt(i) > s2.charAt(i)){
				smallest = 1;
				break;
			}
		}
		System.out.println("The smaller string is " + (smallest == 0 ? s1 : s2));
		sc.close();
    }
}


