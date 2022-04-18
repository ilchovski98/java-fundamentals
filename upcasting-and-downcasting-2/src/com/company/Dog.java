package com.company;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Whoof! Whoof!");
    }

    public void growl() {
        System.out.println("Grrrrrr!");
    }
}
