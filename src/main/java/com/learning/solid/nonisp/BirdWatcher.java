package com.learning.solid.nonisp;

public class BirdWatcher {
    public void watch(Bird bird) {
        bird.fly(); // ❌ not all birds fly
    }

    public static void main(String... args) {
        BirdWatcher birdWatcher = new BirdWatcher();
        Penguin penguin = new Penguin();
        birdWatcher.watch(penguin);
    }
}
