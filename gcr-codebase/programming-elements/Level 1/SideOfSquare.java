import java.util.Scanner;

public class SideOfSquare{
	public static void main(String[] args){
		
		// creating object of scanner and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter perimeter of square : ");
		double perimeter = sc.nextDouble();
		
		//calculating side of square
		double side = perimeter / 4;
	
		System.out.printf( "The length of the side is " + side + " whose perimeter is " + perimeter );
	}
}