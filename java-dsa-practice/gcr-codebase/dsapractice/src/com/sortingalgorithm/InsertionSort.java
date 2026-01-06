package com.sortingalgorithm;

import java.util.Arrays;

public class InsertionSort {
	private static void sort(int[] ids) {
		int n = ids.length;

	    for (int i = 1; i < n; i++) {
	        int key = ids[i];
	        int j = i - 1;

	        while (j >= 0 && ids[j] > key) {
	            ids[j + 1] = ids[j];
	            j--;
	        }

	        ids[j + 1] = key;
	    }
	}
	public static void main(String[] args) {
		int[] id = {5, 4, 7, 1, 2, 0};
		sort(id);
		
		System.out.println(Arrays.toString(id));
	}
}
