import java.util.Scanner;

public class Factors{
    public static void main(String[] args) {
		// Creating Scanner Object, initializing array and variables
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int[] factors = new int[10];
		int maxIndex = 10;
		int index = 0;
		
		// Finding the factors
		for(int i = 1; i <= number; i++){
			if(number%i == 0){
				if(index == maxIndex){
					maxIndex *= 2;
					int[] temp = new int[maxIndex];
					for(int j = 0; j < index; j++) temp[j] = factors[j];
					factors = temp;
				}
				factors[index++] = i;
			}
		}
		
		// printing the factors
		for(int i = 0; i < index; i++){
			System.out.println(factors[i]);
		}

		sc.close();
    }
}