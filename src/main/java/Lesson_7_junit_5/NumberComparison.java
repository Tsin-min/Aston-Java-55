package Lesson_7_junit_5;

public class NumberComparison {
    public static String compare(int a, int b) {
        if (a > b) return "Первое число больше второго";
        if (a < b) return "Первое число меньше второго";
        return "Числа равны";
    }

    public static void main(String[] args) {
        System.out.println(compare(7, 3));
    }
}
