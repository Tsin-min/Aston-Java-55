package org.example;

public abstract class Animal {

    public String name;

    public void run(int a) {
        System.out.println("Бег " + a);
    }

    public void swim(int a) {
        System.out.println("Плаванье " + a);
    }
}