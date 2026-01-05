package com.hashmapandhashset;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	private static int longestConsecutive(int[] nums) {
		int max = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) set.add(num);

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                max = Math.max(max, currLen);
            }
        }

        return max;
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 12};
		System.out.println(longestConsecutive(arr));
	}
}
