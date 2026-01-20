package com.foodfest;

import java.util.*;

public class SortCustomerFootfall {
	private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		int i = 0;
		int j = 0;
		int n = list1.size();
		int m = list2.size();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(i < n && j < m) {
			if(list1.get(i) < list2.get(j)) {
				result.add(list1.get(i++));
			}
			else result.add(list2.get(j++));
		}
		
		while(i < n) result.add(list1.get(i++));
		while(j < m) result.add(list2.get(j++));
		
		return result;
	}
	
	private static ArrayList<Integer> sort(Zone[] zones){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < zones.length; i++) {
			result = merge(result, zones[i].footfallCount);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Zone[] zones = {
			new Zone(0, new ArrayList<>(List.of(50, 60, 70, 85))),
			new Zone(0, new ArrayList<>(List.of(40, 45, 75))),
			new Zone(0, new ArrayList<>(List.of(50, 70, 90))),
			new Zone(0, new ArrayList<>(List.of(50, 85)))
		};
		
		ArrayList<Integer> result = sort(zones);
		System.out.println(result);
	}
}
