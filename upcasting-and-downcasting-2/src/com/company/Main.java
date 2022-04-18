package com.company;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animal = new Animal();
        makeNoise(dog);
    }

    public static void makeNoise(Animal animal) {
        animal.makeNoise();

        if (animal instanceof Dog dog) {
            dog.growl();
        }
    }
}
