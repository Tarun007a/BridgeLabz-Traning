import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of cylinder : ");
		double radius = sc.nextDouble();
		
		System.out.println();
		System.out.print("Enter height of cylinder : ");
		double height = sc.nextDouble();

		double volume = 3.1415 * radius * radius * height;
		
		System.out.println();
		System.out.print("Volume of the cylinder is : " + volume);
	}
}