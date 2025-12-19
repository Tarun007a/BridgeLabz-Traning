import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {
		// Creating Scanner Object and initializing array
        Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
		int[] years = new int[10];
		double[] bonus = new double[10];
		
		// taking input
		for(int i = 0; i < 10; i++){
			System.out.print("Enter salary and year of experience : ");
			double currSalary = sc.nextDouble();
			int currYears = sc.nextInt();
			while(currSalary <= 0 || currYears <= 0){
				System.out.println("Enter correct salary and year of experience");
				currSalary = sc.nextDouble();
				currYears = sc.nextInt();
			}
			salary[i] = currSalary;
			years[i] = currYears;
		}
		
		// calculating bonus 
		for(int i = 0; i < 10; i++){
			if(years[i] >= 5) bonus[i] = salary[i]/20;
			else bonus[i] = salary[i]/50;
			salary[i] += bonus[i];
		}
		
		// printing new salary
		for(int i = 0; i < 10; i++){
			System.out.print(salary[i] + " ");
		}
		
		sc.close();
    }
}