import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circlce : ");
		
		double radius = sc.nextDouble();
		double area = 3.1415 * radius * radius;
		
		System.out.println();
		System.out.print(" : " + area);
	}
}