package com.eventmanagement;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayUser() {
        System.out.println(name + " " + email);
    }
}

