package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    @Test
    void addition() {
        assertEquals(7, Arithmetic.add(3, 4));
    }

    @Test
    void subtraction() {
        assertEquals(-1, Arithmetic.subtract(3, 4));
    }

    @Test
    void multiplication() {
        assertEquals(12, Arithmetic.multiply(3, 4));
    }

    @Test
    void division() {
        assertEquals(2.5, Arithmetic.divide(5, 2), 1e-9);
    }

    @Test
    void divisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> Arithmetic.divide(10, 0));
    }
}