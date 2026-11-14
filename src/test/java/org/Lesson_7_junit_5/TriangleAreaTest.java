package org.Lesson_7_junit_5;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    @Test
    void areaOfTriangleWithBase10AndHeight6Is30() {
        assertEquals(30.0, TriangleArea.calculate(10, 6), 1e-9);
    }

    @Test
    void negativeBaseThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(-5, 4));
    }
}