import java.util.Scanner;

public class YoungestAndTallest{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		double[] height = new double[3];
		int[] age = new int[3];
		
		// taking input
		for(int i = 0; i < 3; i++){
			System.out.print("Enter height and age of first friend : ");
			height[i] = sc.nextDouble();
			age[i] = sc.nextInt();
		}
		
		// finding youngest and tallest
		int youngest = 0;
		int tallest = 0;
		for(int i = 0; i < 3; i++){
			if(age[youngest] < age[i]) youngest = i;
			if(height[tallest] > height[tallest]) tallest = i;
		}
		
		// printing the result
		System.out.println((youngest+1) + " is youngest");
		System.out.println((tallest+1) + " is tallest");
		
		sc.close();
    }
}