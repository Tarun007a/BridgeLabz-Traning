import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		// creating scanner class object and taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to discount dashboard");
		System.out.println("If you shop below 1000 you will get 2% discount");
		System.out.println("If you shop above 1000 you will get 5% discount");
		System.out.println("Enter number of products");
		int n = sc.nextInt();
		int sum  = 0;
		
		// calculating total sum
		for(int i = 0; i < n; i++){
			System.out.print("Enter price of prodcut : ");
			sum += sc.nextInt();
		}
		
		// printing the results
		if(sum >= 1000){
			System.out.println("Total cost " + sum);
			System.out.println("Discount " + (sum/20));
			System.out.println("Discounted cost " + (sum - ((sum/20))));
		}
		else{
			System.out.println("Total cost " + sum);
			System.out.println("Discount " + (sum/50));
			System.out.println("Discounted cost " + (sum - ((sum/50))));
		}
	}
}