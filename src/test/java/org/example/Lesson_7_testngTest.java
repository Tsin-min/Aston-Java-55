package org.example;

import static org.testng.Assert.*;

public class Lesson_7_testngTest {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void runAllTests() {
        XmlSuite suite = new XmlSuite();
        suite.setName("Lesson_7_testng — все тесты");

        XmlTest test = new XmlTest(suite);
        test.setName("Полный прогон");

        List<XmlClass> classes = Arrays.asList(
                new XmlClass(Main.FactorialTest.class),
                new XmlClass(Main.TriangleAreaTest.class),
                new XmlClass(Main.CalculatorTest.class),
                new XmlClass(Main.NumberComparatorTest.class)
        );
        test.setClasses(classes);

        TestNG testng = new TestNG();
        testng.setXmlSuites(List.of(suite));
        testng.run();
    }
}