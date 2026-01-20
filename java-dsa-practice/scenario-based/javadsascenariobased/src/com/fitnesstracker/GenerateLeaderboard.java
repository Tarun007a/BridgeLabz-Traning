package com.fitnesstracker;

import java.util.Arrays;

public class GenerateLeaderboard {
	public static void sort(Person[] persons) {
		int n = persons.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(persons[i].steps < persons[i+1].steps) {
					Person temp = persons[i];
					persons[i] = persons[i+1];
					persons[i+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Person[] persons = {
				new Person("Person 1", 1000),
				new Person("Person 2", 2000),
				new Person("Person 3", 1500),
				new Person("Person 4", 700),
				new Person("Person 5", 500)
		};
		sort(persons);
		System.out.println(Arrays.toString(persons));
	}
}
