package com.learningplatform;

import java.util.*;

public class Quiz {
	public int difficulty;
	public List<String> questions;
	public List<String> options;
	public List<String> answers;
	private List<String> choices;
	
	public Quiz(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public void createQuiz(List<String> questions, List<String> options, List<String> answers) {
		this.questions = questions;
		this.options = options;
		this.answers = answers;
	}
	
	public void attempt(List<String> choices) {
		this.choices = choices;
	}
	
	public int getResult() {
		int n = questions.size();
		int score = 0;
		for(int i = 0; i < n; i++) {
			if(choices.get(i).equals(answers.get(i))) score++;
		}
		return score;
	}
}
