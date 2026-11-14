package Lesson_7_junit_5;

public class Factorial {
    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал числа найден = " + calculate(5));
    }
}
