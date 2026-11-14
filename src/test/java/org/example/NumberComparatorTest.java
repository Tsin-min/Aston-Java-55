package org.example;

import static org.testng.Assert.*;

public class NumberComparatorTest {
    @DataProvider(name = "comparisonCases")
    public Object[][] comparisonCases() {
        return new Object[][] {
                {5, 3, "первое число больше"},
                {2, 9, "первое число меньше"},
                {4, 4, "числа равны"},
                {-7, -7, "числа равны"},
                {-2, 3, "первое число меньше"}
        };
    }

    @Test(dataProvider = "comparisonCases")
    public void testCompare(int a, int b, String expected) {
        assertEquals(NumberComparator.compare(a, b), expected);
    }
}