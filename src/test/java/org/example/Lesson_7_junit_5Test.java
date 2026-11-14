package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Lesson_7_junit_5Test {
    @Test
    void runAllFourClassesTests() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectClass(FactorialTest.class),
                        selectClass(TriangleAreaTest.class),
                        selectClass(ArithmeticTest.class),
                        selectClass(NumberComparisonTest.class)
                )
                .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.execute(request, listener);

        // Печатаем отчёт в консоль
        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));
        summary.printFailuresTo(new PrintWriter(System.out));

        // Проверяем: все тесты прошли без ошибок
        assertEquals(0, summary.getTotalFailureCount(),
                "Есть упавшие тесты, см. отчёт выше");
    }

    @Test
    void runAllProgramsDoesNotThrow() {
        // Дополнительно: проверяем, что метод запуска программ работает без ошибок
        Lesson_7_junit_5.runAllPrograms();
    }
}