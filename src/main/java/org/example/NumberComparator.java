package org.example;

public class NumberComparator {
    public static String compare(int a, int b) {
        if (a > b) {
            return "первое число больше";
        } else if (a < b) {
            return "первое число меньше";
        } else {
            return "числа равны";
        }
    }
}
