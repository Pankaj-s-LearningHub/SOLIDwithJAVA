package com.learning.solid.isp;

public class Sparrow implements Eatable, Flyable {
    public void eat() {
        System.out.println("Sparrow eats seed");
    }

    public void fly() {
        System.out.println("Sparrow flies");
    }
}
