package com.learning.solid.lsp;

public class BirdWatcher {
    public void feedBird(Bird bird) {
        bird.eat();
    }

    public void makeBirdFly(Flyable bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher();
        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();

        birdWatcher.feedBird(bird1); // ✅
        birdWatcher.feedBird(bird2); // ✅

        Flyable flyable = new Sparrow();
        birdWatcher.makeBirdFly(flyable); // ✅
    }
}
