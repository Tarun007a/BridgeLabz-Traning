package com.collageinformationsystem;

public class Faculty extends Person {
    private String department;

    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    public void printDetails() {
        System.out.println(id + " " + name + " " + email + " " + department);
    }
}
