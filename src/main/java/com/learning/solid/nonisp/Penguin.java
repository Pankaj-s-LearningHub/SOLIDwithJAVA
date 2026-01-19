package com.learning.solid.nonisp;

public class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin eats fish");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly");
    }
}
