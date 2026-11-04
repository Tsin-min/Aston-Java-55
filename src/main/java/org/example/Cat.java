package org.example;

public class Cat extends Animal {

    private boolean fullness;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int a) {
        System.out.println(name + " бежит " + a + " метров");
    }

    @Override
    public void swim(int a) {
        System.out.println(name + " не умеет плавать!");
    }
    public void eat(Bowl bowl, int amount) {
        if (bowl.tryTakeFood(amount)) {
            fullness = true;
            System.out.println(name + " поел " + amount + "г еды из миски");
        } else {
            System.out.println(name + " не стал есть: в миске нет столько еды");
        }
    }

    public boolean isFull() { return fullness; }
}
