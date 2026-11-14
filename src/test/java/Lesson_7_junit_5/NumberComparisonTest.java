package Lesson_7_junit_5;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {
    @Test
    void firstGreater() {
        assertEquals("Первое число больше второго", NumberComparison.compare(10, 5));
    }

    @Test
    void firstLess() {
        assertEquals("Первое число меньше второго", NumberComparison.compare(2, 8));
    }

    @Test
    void equal() {
        assertEquals("Числа равны", NumberComparison.compare(4, 4));
    }
}