package com.hashmapandhashset;

import java.util.HashSet;

public class TargetSum {
	private static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int need = target - num;
            if (set.contains(need)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 9};
		System.out.println(hasPairWithSum(arr, 20));
 	}
}
