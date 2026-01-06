package com.fitnesstracker;

import com.sun.tools.classfile.StackMapTable_attribute.same_locals_1_stack_item_frame;

public class DriverClass {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Aman", 22, 50, "Goal 1", 2500);

        Workout w1 = new CardioWorkout(30);
        Workout w2 = new StrengthWorkout(30);
        
        System.out.println(w1.calculateCalories());
        System.out.println(w2.calculateCalories());

        user.displayProfile();
        user.getDailyCalorieTarget();
    }
}
