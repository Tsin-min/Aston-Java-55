package Lesson_7_junit_5;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void factorialOfFiveIs120() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-3));
    }
}