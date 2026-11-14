package org.example;

public class Lesson_7_junit_5 {
    public static void runAllPrograms() {
        // 1. Факториал
        System.out.println("1. Факториал ");
        System.out.println("Факториал найден = " + Factorial.calculate(5));

        // 2. Площадь треугольника
        System.out.println("\n2. Площадь треугольника ");
        System.out.println("Основание 10, высота 6 -> площадь = " + TriangleArea.calculate(10, 6));

        // 3. Арифметика
        System.out.println("\n3. Арифметика ");
        int a = 12, b = 4;
        System.out.println(a + " + " + b + " = " + Arithmetic.add(a, b));
        System.out.println(a + " - " + b + " = " + Arithmetic.subtract(a, b));
        System.out.println(a + " * " + b + " = " + Arithmetic.multiply(a, b));
        System.out.println(a + " / " + b + " = " + Arithmetic.divide(a, b));

        // 4. Сравнение чисел
        System.out.println("\n4. Сравнение чисел ");
        System.out.println(NumberComparison.compare(7, 3));
        System.out.println(NumberComparison.compare(3, 7));
        System.out.println(NumberComparison.compare(5, 5));
    }

    public static void main(String[] args) {
        runAllPrograms();
    }
}
