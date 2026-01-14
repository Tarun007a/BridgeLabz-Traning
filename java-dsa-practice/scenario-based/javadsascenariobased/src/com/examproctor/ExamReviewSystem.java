package com.examproctor;

import java.util.*;

public class ExamReviewSystem {
    private Stack<Integer> st;
    private HashMap<Integer, String> answerMap;
    private HashMap<Integer, Problem> questions;

    public ExamReviewSystem() {
        st = new Stack<>();
        answerMap = new HashMap<>();
        questions = new HashMap<>();

        questions.put(1, new Problem(1, "Java is OOP language Y/N?", "Y"));
        questions.put(2, new Problem(2, "Java keyword for inheritance?", "extends"));
        questions.put(3, new Problem(3, "Data structure used in LIFO?", "stack"));
        questions.put(4, new Problem(4, "SQL command to fetch data?", "select"));
        questions.put(5, new Problem(5, "Keyword to create object?", "new"));
        questions.put(6, new Problem(6, "H in HTML stands for?", "hypertext"));
        questions.put(7, new Problem(7, "Binary of 1?", "1"));
        questions.put(8, new Problem(8, "OOP concept for data hiding?", "encapsulation"));
        questions.put(9, new Problem(9, "Loop with condition first?", "while"));
        questions.put(10, new Problem(10, "Java collection for key-value?", "map"));
    }

    public void attemptExam() {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.print("Enter question number to navigate (1-10): ");
            int no = sc.nextInt();
            sc.nextLine();

            Problem problem = questions.get(no);
            System.out.println(problem.description);

            st.push(no);

            System.out.print("Enter answer: ");
            String ans = sc.nextLine();
            answerMap.put(no, ans);
        }
    }

    public void evaluateScore() {
        int score = 0;

        for(int qid : answerMap.keySet()) {
            String userAns = answerMap.get(qid).trim();
            String correctAns = questions.get(qid).answer;

            if(userAns.equalsIgnoreCase(correctAns)) score++;
        }

        System.out.println("Score : " + score + " of 10");
    }
}
