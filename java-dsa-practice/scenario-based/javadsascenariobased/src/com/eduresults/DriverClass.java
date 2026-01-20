package com.eduresults;

import java.util.*;

public class DriverClass {
	public static ArrayList<Student> merge(ArrayList<Student> students1, ArrayList<Student> students2){
		int i = 0;
		int j = 0;
		int n = students1.size();
		int m = students2.size();
		ArrayList<Student> result = new ArrayList<Student>();
		
		while(i < n && j < m) {
			if(students1.get(i).marks > students2.get(j).marks) result.add(students1.get(i++));
			else result.add(students2.get(j++));
		}
		
		while(i < n) {
			result.add(students1.get(i++));
		}
		
		while(j < m) {
			result.add(students2.get(j++));
		}
		return result;
	}
	
	public static ArrayList<Student> sort(List<District> districts){
		ArrayList<Student> students = new ArrayList<Student>();
		for(District district : districts) {
			students = merge(students, district.students);
		}
		return students;
	}
	
	public static void main(String[] args) {
		List<District> districts = new ArrayList<>();
		districts.add(new District("District 1", new ArrayList<>(List.of(new Student("Student 1", 90), new Student("Student 2", 85), new Student("Student 3", 70)))));
		districts.add(new District("District 2", new ArrayList<Student>(List.of(new Student("Student 4", 80), new Student("Student 5", 65), new Student("Student 6", 60)))));
		districts.add(new District("District 3", new ArrayList<Student>(List.of(new Student("Student 7", 99), new Student("Student 8", 69)))));
		
		ArrayList<Student> students = sort(districts);
		System.out.println(students);
	}
}
