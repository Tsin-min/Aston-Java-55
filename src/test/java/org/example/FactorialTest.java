package org.example;

import static org.testng.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculate(0), 1);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(Factorial.calculate(10), 3628800);
    }

    @Test
    public void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-3));
    }
}