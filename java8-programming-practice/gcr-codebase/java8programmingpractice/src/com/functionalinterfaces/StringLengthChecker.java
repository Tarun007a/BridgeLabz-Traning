package com.functionalinterfaces;

import java.util.List;
import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		List<String> messages = List.of("Message 1", "New lengthy message", "short message");
		
		Function<String, Integer> function = s -> s.length();
		
		messages.stream().map(function).filter(null)
	}
}
