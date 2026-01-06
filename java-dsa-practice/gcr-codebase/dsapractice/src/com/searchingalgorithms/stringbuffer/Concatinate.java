package com.searchingalgorithms.stringbuffer;

public class Concatinate {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String[] arr = {"This ", "is ", " concatinated", " string." };
		
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}
