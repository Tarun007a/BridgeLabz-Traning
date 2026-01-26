package com.reflection;

public class Student {
    private String name;
    private int id;
    
    public Student() {
        this.name = "name";
        this.id = 1;
    }
    
    public String toString() {
        return name + " " + id;
    }
}
