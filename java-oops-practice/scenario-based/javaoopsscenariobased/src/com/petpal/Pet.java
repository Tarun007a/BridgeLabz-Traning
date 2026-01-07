package com.petpal;

public abstract class Pet implements IInteractable {
    public String name;
    public String type;
    public int age;
    private int hunger;
    private int mood;
    private int energy;

    // random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 30;
        this.mood = 30;
        this.energy = 20;
    }

    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }

    protected void increaseMood(int value) {
        mood += value;
    }

    protected void decreaseHunger(int value) {
        hunger -= value;
    }

    protected void increaseEnergy(int value) {
        energy += value;
    }

    protected void decreaseEnergy(int value) {
        energy -= value;
    }

    public void showStatus() {
        System.out.println(name + " " + hunger + " " + mood + " " + energy);
    }

    public abstract void makeSound();
}
