package com.fitnesstracker;

public class UserProfile {
    private String name;
    private int age;
    private double weight;
    private int dailyCalorieTarget;
    private String goal;

    public UserProfile(String name, int age, double weight, String goal, int dailyCalorieTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = dailyCalorieTarget;
    }

    public int getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

    public void displayProfile() {
        System.out.println(name + " " + age + " " + goal);
    }
}

