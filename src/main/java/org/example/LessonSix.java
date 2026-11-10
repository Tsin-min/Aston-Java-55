import java.util.*;

public class LessonSix {

    static class Student {
        private String name;
        private String group;
        private int course;
        private Map<String, Integer> grades; // предмет -> оценка

        public Student(String name, String group, int course, Map<String, Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public String getName() {
            return name;
        }

        public String getGroup() {
            return group;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public Map<String, Integer> getGrades() {
            return grades;
        }

        // Средний балл по всем предметам
        public double getAverageGrade() {
            if (grades == null || grades.isEmpty()) {
                return 0.0;
            }
            double sum = 0;
            for (int grade : grades.values()) {
                sum += grade;
            }
            return sum / grades.size();
        }

        @Override
        public String toString() {
            return name + " (группа " + group + ", курс " + course
                    + ", средний балл " + String.format("%.2f", getAverageGrade()) + ")";
        }
    }

    // Метод 1: удаляет студентов со средним баллом < 3
    public static void removeLowPerformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    // Метод 2: переводит студента на следующий курс, если средний балл >= 3
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    // Метод 3: печатает имена студентов, обучающихся на заданном курсе
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван", "ПИ-101", 1,
                Map.of("Математика", 4, "Физика", 3, "Программирование", 5)));
        students.add(new Student("Мария", "ПИ-102", 1,
                Map.of("Математика", 5, "Физика", 5, "Программирование", 5)));
        students.add(new Student("Пётр", "ПИ-101", 2,
                Map.of("Математика", 2, "Физика", 3, "Программирование", 2))); // ср. балл 2.33
        students.add(new Student("Анна", "ПИ-103", 3,
                Map.of("Математика", 4, "Физика", 4, "Программирование", 4)));
        students.add(new Student("Олег", "ПИ-102", 2,
                Map.of("Математика", 3, "Физика", 3, "Программирование", 4))); // ср. балл 3.33

        System.out.println("Исходный список студентов:");
        students.forEach(s -> System.out.println("  " + s));

        // Удаляем отстающих
        removeLowPerformingStudents(students);
        System.out.println("\nПосле удаления студентов со средним баллом < 3:");
        students.forEach(s -> System.out.println("  " + s));

        // Переводим на следующий курс
        promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        students.forEach(s -> System.out.println("  " + s));

        // Печатаем студентов 2-го курса
        System.out.println("\nСтуденты 2 курса:");
        printStudents(students, 2);

        // Печатаем студентов 4-го курса
        System.out.println("\nСтуденты 4 курса:");
        printStudents(students, 4);
    }
}