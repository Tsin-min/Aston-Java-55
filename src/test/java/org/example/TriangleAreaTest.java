package org.example;

import static org.testng.Assert.*;

public class TriangleAreaTest {
    private static final double DELTA = 1e-9;

    @Test
    public void testRightTriangle() {
        assertEquals(TriangleArea.calculate(3, 4, 5), 6.0, DELTA);
    }

    @Test
    public void testEquilateralTriangle() {
        // площадь равностороннего треугольника со стороной 2 = sqrt(3)
        assertEquals(TriangleArea.calculate(2, 2, 2), Math.sqrt(3), DELTA);
    }

    @Test
    public void testImpossibleTriangleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(1, 2, 10));
    }

    @Test
    public void testNegativeSideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(-3, 4, 5));
    }
}