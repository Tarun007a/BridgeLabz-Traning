package com.robowarhouse;

import java.util.Arrays;

public class Warehouse {
	private static void sort(Pack[] packs) {
		int n = packs.length;
		
		for(int i = 1; i < n; i++) {
			int j = i-1;
			while(j >= 0 && packs[j].weight > packs[j+1].weight) {
				Pack temp = packs[j];
				packs[j] = packs[j+1];
				packs[j+1] = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		Pack[] packs = {
				new Pack("Pack 1", 10), 
				new Pack("Pack 2", 20),
				new Pack("Pack 3", 5),
				new Pack("Pack 4", 15), 
				new Pack("Pack 5", 25)
		};
		sort(packs);
		
		System.out.println(Arrays.toString(packs));
	}
}
