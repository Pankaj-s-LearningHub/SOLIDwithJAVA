package com.learning.solid.nonlsp;

// Subclass that cannot honor the contract ❌
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
