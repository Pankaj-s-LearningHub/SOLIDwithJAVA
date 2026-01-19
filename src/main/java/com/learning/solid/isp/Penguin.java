package com.learning.solid.isp;

public class Penguin implements Swimmable, Eatable {
    public void eat() {
        System.out.println("Penguin eats fish");
    }
    public void swim() {
        System.out.println("Penguin swims");
    }
}
