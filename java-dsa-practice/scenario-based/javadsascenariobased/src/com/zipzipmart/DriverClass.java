package com.zipzipmart;

import java.util.Arrays;

public class DriverClass {
	private static boolean compare(Transaction t1, Transaction t2) {
		if(t1.date.equals(t2.date)) return t1.amount < t2.amount;
		return t1.date.isBefore(t2.date);
	}
	
	private static void merge(int low, int mid, int high, Transaction[] transactions) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		Transaction[] left = new Transaction[n1];
		Transaction[] right = new Transaction[n2];
		
		for(int i = 0; i < n1; i++) left[i] = transactions[low + i];
		for(int i = 0; i < n2; i++) right[i] = transactions[mid + i + 1];
		
		int k = low;
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2) {
			if(compare(left[i], right[j])) transactions[k++] = left[i++];
			else transactions[k++] = right[j++];
		}
		
		while(i < n1) {
			transactions[k++] = left[i++];
		}
		
		while(j < n2) {
			transactions[k++] = right[j++];
		}
	}
	
	private static void mergeSort(int low, int high, Transaction[] transactions) {
		if(low >= high) return;
		
		int mid = low + (high - low) / 2;
		mergeSort(low, mid, transactions);
		mergeSort(mid+1, high, transactions);
		merge(low, mid, high, transactions);
	}
	
	private static void sort(Transaction[] transactions) {
		int n = transactions.length;
		mergeSort(0, n-1, transactions);
	}
	
	public static void main(String[] args) {
		Transaction[] transactions = {
				new Transaction("2026-01-05", 100),
				new Transaction("2026-01-10", 1000),
				new Transaction("2026-01-10", 500),
				new Transaction("2026-01-10", 1000),
				new Transaction("2026-01-02", 100)
		};
		
		sort(transactions);
		
		System.out.println(Arrays.toString(transactions));
	}
}
