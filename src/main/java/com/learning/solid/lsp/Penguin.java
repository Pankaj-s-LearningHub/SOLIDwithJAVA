package com.learning.solid.lsp;

public class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin eats Fish");
    }
}
