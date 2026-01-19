package com.learning.solid.nonlsp;

public class BirdWatcher {
    public void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Penguin();
        new BirdWatcher().makeBirdFly(bird); // 💥 crashes
    }
}