package org.Lesson_7_junit_5;

public class TriangleArea {
    public static double calculate(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными");
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("Площадь треугольника: " + calculate(10, 6));
    }
}
