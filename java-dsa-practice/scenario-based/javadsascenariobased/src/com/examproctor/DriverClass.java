package com.examproctor;

public class DriverClass {
    public static void main(String[] args) {
        ExamReviewSystem exam = new ExamReviewSystem();

        System.out.println("Exam have 10 questions : ");
        exam.attemptExam();

        exam.evaluateScore();
    }
}
