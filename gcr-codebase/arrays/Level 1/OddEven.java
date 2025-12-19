import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
		// Creating Scanner Object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		// validating input
		if(number <= 0){
			System.out.println("Error");
			return;
		}
		
		// intializing array and variables
		int[] even = new int[(number+1)/2];
		int[] odd = new int[(number+1)/2];
		int oddIndex = 0;
		int evenIndex = 0;
		
		// using for loop to traverse and store even odd values
		for(int i = 1; i <= number; i++){
			if(i%2 == 0){
				even[evenIndex++] = i;
			}
			else{
				odd[oddIndex++] = i;
			}
		}
		
		// printing result
		for(int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
		System.out.println();
		for(int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");

		sc.close();
    }
}