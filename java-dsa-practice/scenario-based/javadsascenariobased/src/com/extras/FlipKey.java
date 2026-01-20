package com.extras;

public class FlipKey {
	private static String clearnAndInvert(String str) {
		if(str.length() < 6) return "";
		StringBuilder result = new StringBuilder();
		boolean isEven = true;
		
		for(char ch : str.toCharArray()) {
			// convert to lower case
			if(ch < 90) ch += 32; 
			
			// check valid number
			if(ch >= 97 && ch <= 122) {
				if(ch%2 == 1) result.append(ch);
			}
			else return "";
		}
		
		for(int i = 0; i < result.length(); i++) {
			if(isEven) result.setCharAt(i, (char)(result.charAt(i)-32));
			isEven = !isEven;
		}
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		String[] testcase = {"Aeroplane",  "Cowages", "Magic", "Kinder World", "B@rbie"};
		
		for(String test : testcase) {
			String result = clearnAndInvert(test);
			
			if(result.length() == 0) System.out.println("Invalid Input");
			else System.out.println("The genereated key is - " + result);
		}
	}
}
