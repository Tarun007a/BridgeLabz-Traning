package com.cropmonitor;

import java.util.Arrays;

public class OrderData {
	private static int partition(int lo, int hi, Sample[] samples) {
		double pivot = samples[hi].temp;
		
		int i = lo-1;
		for(int j = lo; j < hi; j++) {
			if(samples[j].temp < pivot) {
				i++;
				Sample temp = samples[i];
				samples[i] = samples[j];
				samples[j] = temp;
			}
		}

		Sample temp = samples[i+1];
		samples[i+1] = samples[hi];
		samples[hi] = temp;
		return i+1;
	}
	
	private static void quickSort(int lo, int hi, Sample[] samples) {
		if(lo >= hi) return;
		int idx = partition(lo, hi, samples);
		
		quickSort(lo, idx-1, samples);
		quickSort(idx+1, hi, samples);
	}
	
	private static void sort(Sample[] samples) {
		int n = samples.length;
		quickSort(0, n-1, samples);
	}
	
	public static void main(String[] args) {
		Sample[] samples = {
				new Sample(0, 30),
				new Sample(2, 40),
				new Sample(3, 33),
				new Sample(4, 31),
				new Sample(5, 37)
		};
		sort(samples);
		System.out.println(Arrays.toString(samples));
	}
}
