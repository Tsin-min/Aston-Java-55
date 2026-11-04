package org.example;

public class Cat extends Animal {

    @Override
    public void run(int a) {
        System.out.println(name + "бежит " + a + " метров");
    }
    @Override
    public void swim(int a) {
        System.out.println("Коты не умеют плавать!");
    }
}
