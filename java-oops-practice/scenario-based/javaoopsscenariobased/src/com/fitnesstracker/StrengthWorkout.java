package com.fitnesstracker;

public class StrengthWorkout extends Workout {
    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    public void startWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println("Strength workout started");
    }

    public void stopWorkout() {
        System.out.println("Strength workout stopped");
    }

    public int calculateCalories() {
        return duration * 25;
    }
}
