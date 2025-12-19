import java.util.Scanner;

public class Array2d{
    public static void main(String[] args) {
		// Creating Scanner Object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter columns : ");
		int columns = sc.nextInt();
		
		// initializing the 2d and 1d array
		int[][] arr1 = new int[rows][columns];
		int[] arr2 = new int[rows * columns];
		
		// taking input for 2d array
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print("Enter number : ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		// storing values of 2d array in 1d array
		int index = 0;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				arr2[index++] = arr1[i][j]; 
			}
		}
		
		// Printing the resultant 1d array
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		sc.close();
    }
}