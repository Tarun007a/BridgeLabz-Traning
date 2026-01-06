package com.sortingalgorithm;

import java.util.Arrays;

public class BubbleSort {
	static void sort(int[] marks) {
	    int n = marks.length;

	    for (int i = 0; i < n - 1; i++) {
	        boolean flag = false;

	        for (int j = 0; j < n - i - 1; j++) {
	            if (marks[j] > marks[j + 1]) {
	                int temp = marks[j];
	                marks[j] = marks[j + 1];
	                marks[j + 1] = temp;
	                flag = true;
	            }
	        }
	        if (!flag) break;
	    }
	}
	
	public static void main(String[] args) {
		int[] marks = {5, 4, 7, 1, 2, 0};
		sort(marks);
		
		System.out.println(Arrays.toString(marks));
	}
}
