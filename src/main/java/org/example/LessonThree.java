package org.example;

public class LessonThree {

    public static void main(String[] args) {
        Cat catFluff = new Cat();
        Cat catLavender = new Cat();
        Dog dogAnchovy = new Dog();

        catFluff.run(200);
        catLavender.run(200);
        dogAnchovy.run(500);
        catFluff.swim(200);
        catLavender.swim(200);
        dogAnchovy.swim(10);
    }
}
