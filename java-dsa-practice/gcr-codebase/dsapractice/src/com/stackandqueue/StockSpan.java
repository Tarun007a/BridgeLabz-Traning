package com.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }

            if (st.isEmpty()) span[i] = i + 1;
            else span[i] = i - st.peek();

            st.push(i);
        }

        return span;
    }
    public static void main(String[] args) {
    	int[] arr = {8,6,7,1,2,9,3};
    	System.out.println(Arrays.toString(calculateSpan(arr)));
    }
}
