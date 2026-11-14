package org.example;

import static org.testng.Assert.*;

public class CalculatorTest {
    @DataProvider(name = "intPairs")
    public Object[][] intPairs() {
        return new Object[][] {
                {10, 2},
                {7, 3},
                {-5, 4},
                {0, 6}
        };
    }

    @Test(dataProvider = "intPairs")
    public void testAdd(int a, int b) {
        assertEquals(Calculator.add(a, b), a + b);
    }

    @Test(dataProvider = "intPairs")
    public void testSubtract(int a, int b) {
        assertEquals(Calculator.subtract(a, b), a - b);
    }

    @Test(dataProvider = "intPairs")
    public void testMultiply(int a, int b) {
        assertEquals(Calculator.multiply(a, b), a * b);
    }

    @Test(dataProvider = "intPairs")
    public void testDivide(int a, int b) {
        if (b != 0) {
            assertEquals(Calculator.divide(a, b), a / b);
        }
    }

    @Test
    public void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(8, 0));
    }
}