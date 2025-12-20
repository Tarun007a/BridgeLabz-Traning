import java.util.Scanner;

public class YoungestAndTallest{
	// return the youngest among 3
	private static int getYoungest(int[] age){
		int youngest = 0;
		for(int i = 0; i < 3; i++){
			if(age[youngest] > age[i]) youngest = i;
		}
		return youngest;
	}
	
	// return the tallest among 3
	private static int getTallest(double[] height){
		int tallest = 0;
		for(int i = 0; i < 3; i++){
			if(height[i] > height[tallest]) tallest = i;
		}
		return tallest;
	}
	
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
		
		// calling function and printing the result
		int youngest = getYoungest(age)+1;
		int tallest = getTallest(height)+1;
		System.out.println(youngest + " is youngest");
		System.out.println(tallest + " is tallest");
		
		sc.close();
    }
}