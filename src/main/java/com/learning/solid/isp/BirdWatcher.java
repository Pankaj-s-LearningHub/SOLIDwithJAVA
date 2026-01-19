package com.learning.solid.isp;

public class BirdWatcher {
    public void feed(Eatable bird) {
        bird.eat();
    }

    public void makeFly(Flyable bird) {
        bird.fly();
    }

    public void makeSwim(Swimmable bird) {
        bird.swim();
    }

    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher();

        // Sparrow
        Sparrow sparrow = new Sparrow();
        watcher.feed(sparrow);
        watcher.makeFly(sparrow);

        Penguin penguin = new Penguin();
        watcher.feed(penguin);
        watcher.makeSwim(penguin);

        // ❌ Compile-time safety (uncomment to see error)
        //watcher.makeFly(penguin);
    }
}
