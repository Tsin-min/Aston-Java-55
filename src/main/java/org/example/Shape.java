package org.example;

// Shape.java — интерфейс с дефолтными методами
public interface Shape {

    // Дефолтный метод расчёта периметра — доступен всем фигурам
    default double getPerimeter() {
        System.out.println("Периметр не задан для этой фигуры");
        return 0;
    }

    // Дефолтный метод расчёта площади — доступен всем фигурам
    default double getArea() {
        System.out.println("Площадь не задана для этой фигуры");
        return 0;
    }

    // Абстрактные методы — каждую фигуру реализует по-своему
    String getFillColor();
    String getBorderColor();

    // Ещё один дефолтный метод: вывод всех характеристик
    default void printInfo() {
        System.out.println("Фигура:        " + getClass().getSimpleName());
        System.out.printf ("Периметр:      %.2f%n", getPerimeter());
        System.out.printf ("Площадь:       %.2f%n", getArea());
        System.out.println("Цвет фона:     " + getFillColor());
        System.out.println("Цвет границы:  " + getBorderColor());
        System.out.println("---------------------------------");
    }
}