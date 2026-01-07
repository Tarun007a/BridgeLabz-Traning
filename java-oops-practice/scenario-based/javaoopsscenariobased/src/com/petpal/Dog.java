package com.petpal;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
    }

    public void play() {
        increaseMood(20);
        decreaseEnergy(15);
    }

    public void sleep() {
        increaseEnergy(25);
    }

    public void makeSound() {
        System.out.println("Dog sound");
    }
}
