package com.sortingalgorithm;

import java.util.Arrays;

public class SelectionSort {
	private static void sort(int[] scores) {
	    int n = scores.length;

	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;

	        for (int j = i + 1; j < n; j++) {
	            if (scores[j] < scores[minIndex]) minIndex = j;
	        }

	        int temp = scores[minIndex];
	        scores[minIndex] = scores[i];
	        scores[i] = temp;
	    }
	}

	public static void main(String[] args) {
		int[] scores = {5, 4, 7, 1, 2, 0};
		sort(scores);
		
		System.out.println(Arrays.toString(scores));
	}
}
