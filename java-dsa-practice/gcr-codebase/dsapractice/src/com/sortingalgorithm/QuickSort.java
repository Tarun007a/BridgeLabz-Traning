package com.sortingalgorithm;

import java.util.Arrays;

public class QuickSort {
	private static int partition(int low, int high, int[] prices) {
	    int pivot = prices[high];
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (prices[j] <= pivot) {
	            i++;
	            int temp = prices[i];
	            prices[i] = prices[j];
	            prices[j] = temp;
	        }
	    }

	    int temp = prices[i + 1];
	    prices[i + 1] = prices[high];
	    prices[high] = temp;

	    return i + 1;
	}
	private static void sort(int lo, int hi, int[] prices) {
		if(lo >= hi) return;
		
		int pivotIndex = partition(lo, hi, prices);
	    sort(lo, pivotIndex - 1, prices);
	    sort(pivotIndex + 1, hi, prices);
	}
	
	public static void main(String[] args) {
		int[] prices = {5, 4, 7, 1, 2, 0};
		sort(0, prices.length-1, prices);
		
		System.out.println(Arrays.toString(prices));
	}
}
