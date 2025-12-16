import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principal amount : ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter rate of interest : ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter time in years : ");
		double time = sc.nextDouble();
		
		double si = (principal * rate * time) / 100.0;
		System.out.println(si);
	}
}