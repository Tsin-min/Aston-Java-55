package org.example;

public class LessonOne {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println (chekOne(5, 7));

        checkNumber(5);

        System.out.println(isNegative(-5));

        printStringNtimes("Привет", 3);

        System.out.println(checkLeapYear(1223));

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        integerArray(arr1);
        System.out.println();

        emptyArray(100);
        System.out.println();

        int[] arr3 = {1, 5, 3, 2 ,11, 4, 5, 2, 4, 8, 9, 1};
        smallArray(arr3);
        System.out.println();

        squareArray();
        System.out.println();

        twoArguments(4, 1);
        System.out.println();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 20;
        int b = 20;
        int sum = a+b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");}
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");}
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean chekOne(int a, int b) {
        return ((a+b) > 10 && (a + b) < 20);
    }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " Положительное");
        } else {
            System.out.println(number + " Отрицательное");
        }
    }
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printStringNtimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static boolean checkLeapYear (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
    public static void integerArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void emptyArray ( int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void smallArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void  squareArray (){
        int [] [] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void twoArguments(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }
    }
}
