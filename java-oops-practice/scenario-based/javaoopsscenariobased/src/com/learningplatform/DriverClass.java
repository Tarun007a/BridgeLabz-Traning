package com.learningplatform;

import java.util.*;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of questoins : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		FullTimeCourse course = new FullTimeCourse();
		
		List<String> questions = new ArrayList<>();
		List<String> options = new ArrayList<>();
		List<String> answer = new ArrayList<>();
		List<String> choices = new ArrayList<>();
		Quiz quiz = new Quiz(8);
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter question " + (i+1));
			questions.add(sc.nextLine());
			
			System.out.println("Enter optoins ");
			options.add(sc.nextLine());
			
			System.out.println("Enter answer ");
			answer.add(sc.nextLine());
		}
		
		quiz.createQuiz(questions, options, answer);
		
		for(int i = 0; i < n; i++) {
			System.out.println(quiz.questions.get(i));
			System.out.println(quiz.options.get(i));
			System.out.print("Enter you choice : ");
			choices.add(sc.nextLine());
		}
		quiz.attempt(choices);
		
		course.generateCertificate();
		System.out.println(quiz.getResult());
	}
}
