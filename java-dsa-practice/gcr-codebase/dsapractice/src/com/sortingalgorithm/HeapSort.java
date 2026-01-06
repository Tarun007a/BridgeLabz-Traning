package com.sortingalgorithm;

import java.util.*;

public class HeapSort {
	private static void sort(int[] salaries) {
		int n = salaries.length;

	    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);

	    for (int salary : salaries) maxHeap.add(salary);

	    for (int i = n-1; i >= 0; i--) {
	        salaries[i] = maxHeap.remove();
	    }
	}
	
	public static void main(String[] args) {
		int[] salaries = {5000, 4000, 7000, 1000, 2000, 1000};
		sort(salaries);
		
		System.out.println(Arrays.toString(salaries));
	}
}
