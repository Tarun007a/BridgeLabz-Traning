package com.studentrankgenerator;

import java.util.Arrays;

public class DriverClass {
	private static void merge(int low, int mid, int high, Student[] students) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		Student[] left = new Student[n1];
		Student[] right = new Student[n2];
		
		for(int i = 0; i < n1; i++) left[i] = students[low + i];
		for(int i = 0; i < n2; i++) right[i] = students[mid + i + 1];
		
		int k = low;
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2) {
			if(left[i].score > right[j].score) students[k++] = left[i++];
			else students[k++] = right[j++];
		}
		
		while(i < n1) {
			students[k++] = left[i++];
		}
		
		while(j < n2) {
			students[k++] = right[j++];
		}
	}
	
	private static void mergeSort(int low, int high, Student[] students) {
		if(low >= high) return;
		
		int mid = low + (high - low) / 2;
		
		mergeSort(low, mid, students);
		mergeSort(mid+1, high, students);
		merge(low, mid, high, students);
	}
	
	private static void sort(Student[] students) {
		int n = students.length;
		mergeSort(0, n-1, students);
	}
	
	public static void main(String[] args) {
		Student[] students = {
				new Student("student 1", 90), 
				new Student("Student 2", 80), 
				new Student("student 3", 95), 
				new Student("Student 4", 50),
				new Student("Student 5", 85)
		};
		
		sort(students);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("Rank " + (i+1) + " " + students[i].name);
		}
	}
}
