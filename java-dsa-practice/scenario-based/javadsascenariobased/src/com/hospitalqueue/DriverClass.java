package com.hospitalqueue;

import java.util.Arrays;

public class DriverClass {
	private static void sort(Patient[] patients) {
		int n = patients.length;
		
		for(int i = 0; i < n-1; i++) {
			boolean isSwapped = false;
			
			for(int j = 1; j <= n-i-1; j++) {
				if(patients[j].criticality > patients[j-1].criticality) {
					isSwapped = true;
					Patient temp = patients[j];
					patients[j] = patients[j-1];
					patients[j-1] = temp;
				}
			}
			if(!isSwapped) break;
		}
	}
	public static void main(String[] args) {
		Patient[] patients = {
				new Patient("Patient1", 1),
				new Patient("Patient2", 2),
				new Patient("Patient3", 3),
				new Patient("Patient4", 4),
				new Patient("Patient5", 5)
		};
		sort(patients);
		System.out.println(Arrays.toString(patients));
	}
}
