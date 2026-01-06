package com.fitnesstracker;

public abstract class Workout implements ITrackable {
    public String type;
    public int duration;
    public int caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
    }

    public abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
