package com.learning.solid.lsp;

public class Sparrow implements Bird, Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats seed");
    }

}
