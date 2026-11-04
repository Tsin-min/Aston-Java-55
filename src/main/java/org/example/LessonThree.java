package org.example;

public class LessonThree {

    public static void main(String[] args) {
        Cat catFluff = new Cat("Кот Пушок");
        Cat catLavender = new Cat("Кот Кузя");
        Dog dogAnchovy = new Dog("Собака Анчоус");

        catFluff.run(200);
        catLavender.run(200);
        dogAnchovy.run(500);
        catFluff.swim(200);
        catLavender.swim(200);
        dogAnchovy.swim(10);

        Cat[] cats = {catFluff, catLavender};
        Bowl bowl = new Bowl(10);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        bowl.addFood(20);
        System.out.println("В миске сейчас: " + bowl.getFood() + "г еды");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        Animal.info();
    }
}