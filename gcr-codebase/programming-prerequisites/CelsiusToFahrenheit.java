import java.util.Scanner;

public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degree in celsius : ");
		
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9.0/5.0) + 32;
		
		System.out.println();
		System.out.print("Degree in fahrenheit : " + fahrenheit);
	}
}