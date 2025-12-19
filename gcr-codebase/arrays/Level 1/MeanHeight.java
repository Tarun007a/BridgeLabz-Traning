import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0;
		
		// taking input in array using a loop
		for(int i = 0; i < heights.length; i++){
			System.out.print("Enter height : ");
			heights[i] = sc.nextInt();
		}
		
		// Calculating sum
		for(int i = 0; i < heights.length; i++){
			sum += heights[i];
		}
		
		// Calculating mean height and printing results
		double meanHeight = sum / 11;
		System.out.println("Mean height is : " + meanHeight);

		sc.close();
    }
}