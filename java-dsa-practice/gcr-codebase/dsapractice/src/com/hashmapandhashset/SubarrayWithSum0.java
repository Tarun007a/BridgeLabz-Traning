package com.hashmapandhashset;

import java.util.*;

public class SubarrayWithSum0 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }
    public static void main(String[] args) {
    	int[] arr = {-1, 1, 2, 4, -4, -2, 6, -6};
    	List<int[]> result = findZeroSumSubarrays(arr);
    	for(int[] curr : result) {
    		System.out.println(curr[0] + " " + curr[1]);
    	}
    }
}
