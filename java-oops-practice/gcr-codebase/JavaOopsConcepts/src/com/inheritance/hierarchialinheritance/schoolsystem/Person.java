package com.inheritance.hierarchialinheritance.schoolsystem;

public class Person {
    public String name;
    public int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // display details
    public void displayDetails() {
        System.out.println(name + " | " + age);
    }
}
