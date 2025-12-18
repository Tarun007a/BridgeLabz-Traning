import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args) {
        //Create Scanner object and taking input
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // using for loop to print result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
		
		sc.close();
    }
}