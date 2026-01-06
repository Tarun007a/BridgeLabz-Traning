package com.fitnesstracker;

public class CardioWorkout extends Workout {
    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    public void startWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println("Cardio workout started");
    }

    public void stopWorkout() {
        System.out.println("Cardio workout stopped");
    }

    public int calculateCalories() {
        return duration * 20;
    }
}
