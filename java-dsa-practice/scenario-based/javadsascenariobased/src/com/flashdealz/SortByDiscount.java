package com.flashdealz;

import java.util.Arrays;

public class SortByDiscount {
	private static int partition(int lo, int hi, Product[] products) {
		double pivot = products[hi].discount;
		
		int i = lo-1;
		for(int j = lo; j < hi; j++) {
			if(products[j].discount > pivot) {
				i++;
				Product temp = products[i];
				products[i] = products[j];
				products[j] = temp;
			}
		}

		Product temp = products[i+1];
		products[i+1] = products[hi];
		products[hi] = temp;
		return i+1;
	}
	
	private static void quickSort(int lo, int hi, Product[] products) {
		if(lo >= hi) return;
		int idx = partition(lo, hi, products);
		
		quickSort(lo, idx-1, products);
		quickSort(idx+1, hi, products);
	}
	
	private static void sort(Product[] products) {
		quickSort(0, products.length-1, products);
	}
	
	public static void main(String[] args) {
		Product[] products = {
				new Product("Product 1", 5),
				new Product("Product 2", 6),
				new Product("Product 3", 3),
				new Product("Product 4", 10),
				new Product("Product 5", 4),
		};
		sort(products);
		System.out.println(Arrays.toString(products));
	}
}
