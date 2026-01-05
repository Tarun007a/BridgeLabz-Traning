package com.collageinformationsystem;

public class Student extends Person implements ICourseActions {
    private int[] grades;
    private int gradeCount;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new int[5];
        gradeCount = 0;
    }

    public void addGrade(int grade) {
        if(gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        }
    }

    public double calculateGpa() {
        if(gradeCount == 0) return 0;
        int total = 0;
        
        for(int i = 0; i < gradeCount; i++) {
            total += grades[i];
        }
        return total / (double) gradeCount;
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
    }

    public void printDetails() {
        System.out.println(id + " " + name + " " + email + " " + calculateGpa());
    }
}
