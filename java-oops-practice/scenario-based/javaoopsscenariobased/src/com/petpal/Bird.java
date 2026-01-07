package com.petpal;

public class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        decreaseHunger(10);
        increaseMood(12);
    }

    public void play() {
        increaseMood(18);
        decreaseEnergy(12);
    }

    public void sleep() {
        increaseEnergy(20);
    }

    public void makeSound() {
        System.out.println("Bird sound");
    }
}
