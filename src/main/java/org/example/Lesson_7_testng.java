package org.example;

public class Lesson_7_testng {
    public static void main(String[] args) {
        runFactorial();
        runTriangleArea();
        runCalculator();
        runNumberComparator();
    }

    private static void runFactorial() {
        System.out.println("1.Факториал числа ");
        int n = 5;
        System.out.println("Факториал числа найден = " + Factorial.calculate(n));
    }

    private static void runTriangleArea() {
        System.out.println("\n2.Площадь треугольника ");
        double a = 3, b = 4, c = 5;
        System.out.printf("Треугольник со сторонами %.0f, %.0f, %.0f " +
                "имеет площадь %.2f%n", a, b, c, TriangleArea.calculate(a, b, c));
    }

    private static void runCalculator() {
        System.out.println("\n3.Арифметика ");
        int x = 10, y = 4;
        System.out.println(x + " + " + y + " = " + Calculator.add(x, y));
        System.out.println(x + " - " + y + " = " + Calculator.subtract(x, y));
        System.out.println(x + " * " + y + " = " + Calculator.multiply(x, y));
        System.out.println(x + " / " + y + " = " + Calculator.divide(x, y));
    }

    private static void runNumberComparator() {
        System.out.println("\n4.Сравнение чисел ");
        int a = 7, b = 12;
        System.out.println(a + " и " + b + ": " + NumberComparator.compare(a, b));
    }
}
