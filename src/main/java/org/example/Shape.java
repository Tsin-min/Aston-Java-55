package org.example;

public interface Shape {

    default double getPerimeter() {
        System.out.println("Периметр не задан для этой фигуры");
        return 0;
    }

    default double getArea() {
        System.out.println("Площадь не задана для этой фигуры");
        return 0;
    }

    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.println("Фигура:        " + getClass().getSimpleName());
        System.out.printf ("Периметр:      %.2f%n", getPerimeter());
        System.out.printf ("Площадь:       %.2f%n", getArea());
        System.out.println("Цвет фона:     " + getFillColor());
        System.out.println("Цвет границы:  " + getBorderColor());
        System.out.println("---------------------------------");
    }
}