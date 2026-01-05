package com.collageinformationsystem;

public class DriverClass {
    public static void main(String[] args) {
        Faculty faculty = new Faculty(1, "Faculty 1", "facutly@gmail.com", "Computer Science");

        Course course = new Course(101, "Java", faculty);

        Student s1 = new Student(11, "Aman", "aman@gmail.com");
        Student s2 = new Student(12, "Tarun", "tarun@gmail.com");

        s1.addGrade(8);
        s1.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        s1.enrollCourse(course);
        s2.enrollCourse(course);

        course.displayCourseDetails();
    }
}
