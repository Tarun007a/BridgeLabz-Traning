package com.stackandqueue;

import java.util.*;

public class SlidingWindowMaximum {
	private static int[] Nge(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        nge[n - 1] = n;
        for(int i = n - 2 ; i >= 0 ; i--){
            while(st.size() > 0 && arr[st.peek()] < arr[i]) st.pop();
            if(st.size() == 0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        return nge;
    }
	
	private static int[] maxSlidingWindow(int[] nums, int k) {
        int n  = nums.length;
        int z = 0;
        int j = 0;
        int[] ans = new int[n - k + 1];
        int[] nge = Nge(nums);
        for(int i = 0 ; i < n - k + 1 ; i++){
            if(j >= i + k) j = i;   //if it get out of window
            int max = nums[j];
            while(j < i + k){    //this loop will run total for n 
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, -1, 6, 5, 3, 7};
		System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
	}
}
