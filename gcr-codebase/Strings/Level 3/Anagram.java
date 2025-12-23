import java.util.Scanner;

class Anagram{
	// method to check anagram 
    static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
        int[] freq1 = new int[256];
		int[] freq2 = new int[256];
		
		for(char ch : s1.toCharArray()) freq1[ch]++;
		for(char ch : s2.toCharArray()) freq2[ch]++;

        int index = 0;
		for(int i = 0; i < 256; i++){
			if(freq1[i] != freq2[i]) return false;
		}
        return true;
    }

    public static void main(String[] args){
		// creating scanner class object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter strings : ");
        String s1 = sc.next();
		String s2 = sc.next();
		
		// calling fucntion and printing results
		System.out.println(isAnagram(s1, s2));
    }
}
