package com.collageinformationsystem;

public class Course {
    private int courseId;
    private String courseName;
    private Faculty faculty;
    private Student[] students;
    private int studentCount;

    // constructor
    public Course(int courseId, String courseName, Faculty faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.faculty = faculty;
        students = new Student[10];
        studentCount = 0;
    }

    // add student
    public void addStudent(Student student) {
        if(studentCount < students.length) students[studentCount++] = student;
    }

    public void removeStudent(Student student) {
        for(int i = 0; i < studentCount; i++) {
            if(students[i] == student) {
                for(int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
            }
        }
    }

    public void displayCourseDetails() {
        System.out.println(courseId + " " + courseName);
        for(int i = 0; i < studentCount; i++) {
            students[i].printDetails();
        }
    }
}
