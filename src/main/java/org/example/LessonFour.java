package org.example;

public class LessonFour{
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0, "жёлтый", "красный"),
                new Rectangle(4.0, 6.0, "зелёный", "синий"),
                new Triangle(3.0, 4.0, 5.0, "белый", "чёрный")
        };

        for (Shape shape : shapes) {
            shape.printInfo();   // дефолтный метод интерфейса
        }
    }
}
