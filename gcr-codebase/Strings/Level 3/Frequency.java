import java.util.Scanner;

class Frequency{
    // Method to find unique characters using nested loops
    static char[] getUnique(String s) {
		int n = s.length();
        char[] arr = new char[s.length()];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean isPresent = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                arr[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = arr[i];

        return result;
	}

    // method to return 2d array with char and freq
    static String[][] getGrid(String s){
        int[] freq = new int[256];
		char[] unique = getUnique(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        
		int n = unique.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            char ch = unique[i];
            result[i][0] = "" + ch;
            result[i][1] ="" +  freq[ch];
        }
        return result;
    }

    public static void main(String[] args) {
		// creating scanner object and taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();

        String[][] arr = getGrid(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
