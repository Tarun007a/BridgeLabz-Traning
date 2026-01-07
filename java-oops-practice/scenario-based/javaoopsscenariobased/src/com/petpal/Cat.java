package com.petpal;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        decreaseHunger(15);
        increaseMood(8);
    }

    public void play() {
        increaseMood(15);
        decreaseEnergy(10);
    }

    public void sleep() {
        increaseEnergy(30);
    }

    public void makeSound() {
        System.out.println("Cat sound");
    }
}
