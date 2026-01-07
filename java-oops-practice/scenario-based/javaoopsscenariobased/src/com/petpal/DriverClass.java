package com.petpal;

public class DriverClass {
    public static void main(String[] args) {
        Pet dog = new Dog("Dog", 3);
        Pet cat = new Cat("Cat", 2);
        Pet bird = new Bird("Bird", 1);

        dog.makeSound();
        dog.feed();
        dog.play();
        dog.showStatus();

        cat.makeSound();
        cat.feed();
        cat.sleep();
        cat.showStatus();

        bird.makeSound();
        bird.play();
        bird.sleep();
        bird.showStatus();
    }
}
