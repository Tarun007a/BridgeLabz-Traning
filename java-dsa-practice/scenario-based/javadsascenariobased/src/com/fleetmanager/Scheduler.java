package com.fleetmanager;

import java.util.Arrays;
import java.util.Scanner;

public class Scheduler {
	private static Vehicle[] merge(Vehicle[] vehicles1, Vehicle[] vehicles2) {
		int n1 = vehicles1.length;
		int n2 = vehicles2.length;
		
		Vehicle[] vehicles = new Vehicle[n1 + n2];
		
		int k = 0;
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2) {
			if(vehicles1[i].mileage > vehicles2[j].mileage) vehicles[k++] = vehicles1[i++];
			else vehicles[k++] = vehicles2[j++];
		}
		
		while(i < n1) {
			vehicles[k++] = vehicles1[i++];
		}
		
		while(j < n2) {
			vehicles[k++] = vehicles2[j++];
		}
		return vehicles;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle[] vehicles = new Vehicle[0];
		while(true) {
			System.out.print("Enter -1 to exit : ");
			if(sc.nextInt() == -1) return;
			
			System.out.print("Enter number of vehicles in depot : ");
			int n = sc.nextInt();
			
			Vehicle[] currVehicles = new Vehicle[n];
			
			for(int i = 0; i < n; i++) {
				System.out.println("Enter no and mileage of vehicle ");
				int no = sc.nextInt();
				int mileage = sc.nextInt();
				
				currVehicles[i] = new Vehicle(no, mileage);
			}
			vehicles = merge(vehicles, currVehicles);
			System.out.println(Arrays.toString(vehicles));
		}
	}
}
