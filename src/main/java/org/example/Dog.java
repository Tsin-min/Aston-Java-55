package org.example;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void run(int a) {
        System.out.println(name + " бежит " + a + " метров");
    }
    @Override
    public void swim(int a) {
        System.out.println(name + " плывёт " + a + " метров");
    }
}
