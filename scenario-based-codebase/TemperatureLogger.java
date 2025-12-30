import java.util.Scanner;

public class TemperatureLogger{
	public static void main(String[] args){
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int sum = 0;
		double avg;
		double[] temperature = new double[n];
		int max = 0;
		int min = 0;
		
		// taking input and also recording the minimum and maximum temperature
		for(int i = 0; i < n; i++){
			System.out.print("Enter temperature on day " + (i+1) + " : ");
			temperature[i] = sc.nextDouble();
			if(temperature[i] < temperature[min]) min = i;
			if(temperature[i] > temperature[max]) max = i;
		}
		
		// calculating sum of temperature
		for(double temp : temperature) sum += temp;
		
		// calculating average
		avg = sum/7;
		
		// printing the results
		System.out.println("The average temperature is " + avg);
		System.out.println("The maximum temperature was on day " + (max+1) + " and the maximum temperature was " + temperature[max]);
		System.out.println("The minimum temperature was on day " + (min+1) + " and the minimum temperature was " + temperature[min]);
	}
}