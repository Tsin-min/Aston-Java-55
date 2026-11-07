package org.example;

public class LessonFive{
    // 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    // 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит
    // символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
    // в какой именно ячейке лежат неверные данные.

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4, получено строк: "
                    + (array == null ? "null" : array.length));
        }
        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4, в строке " + i
                        + " элементов: " + (array[i] == null ? 0 : array[i].length));
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке [" + i + "][" + j + "]: \"" + array[i][j] + "\"");
                }
            }
        }
        return sum;
    }

    //3. В методе main() вызвать полученный метод, обработать возможные исключения
    // MyArraySizeException и MyArrayDataException и вывести результат расчета.
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7"}
        };

        String[][] wrongData = {
                {"1", "2", "3", "4"},
                {"5", "6", "о", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        for (String[][] arr : new String[][][]{correct, wrongSize, wrongData}) {
            try {
                System.out.println("Сумма: " + sumArray(arr));
            } catch (MyArraySizeException e) {
                System.out.println("MyArraySizeException: " + e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println("MyArrayDataException: " + e.getMessage());
            }
        }

        //4. Напишите код для генерации и поимки ArrayIndexOutOfBoundsException.
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
