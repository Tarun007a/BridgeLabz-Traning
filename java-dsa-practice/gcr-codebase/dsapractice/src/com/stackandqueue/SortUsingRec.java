package com.stackandqueue;

import java.util.Stack;

public class SortUsingRec {
	private static void sort(Stack<Integer> st) {
		if(st.isEmpty()) return;
		
		int ele = st.pop();
		sort(st);
		
		Stack<Integer> curr = new Stack<>();
		while(!st.isEmpty() && st.peek() < ele) curr.push(st.pop());
		
		st.push(ele);
		while(!curr.isEmpty()) st.push(curr.pop());
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		for(int i = 5; i >= 0; i--) st.push(i);
		sort(st);
		
		System.out.println(st);
	}
}
