package org.example;

public abstract class Animal {

    public String name;

    public static void info() {
        System.out.println("Всего животных: 3. Из них 1 собака, и 2 кота");
    }

    public String getName() {
        return name;
    }

    public void run(int a) {
        System.out.println("Бег " + a);
    }

    public void swim(int a) {
        System.out.println("Плаванье " + a);
    }
}