package Lesson_7_junit_5;

public class Arithmetic {
    public static int add(int a, int b)      { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int a = 12, b = 4;
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " / " + b + " = " + divide(a, b));
    }
}
