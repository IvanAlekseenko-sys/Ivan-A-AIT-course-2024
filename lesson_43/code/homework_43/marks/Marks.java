package homework_43.marks;

import java.util.ArrayList;
import java.util.List;

public class Marks {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Добавляем 20 студентов
        for (int i = 1; i <= 20; i++) {
            students.add(new Student("Student" + i));
        }

        // Выводим список студентов
        students.forEach(System.out::println);


        System.out.println("------------------------------------------");
        // Находим максимальное и минимальное среднее значение
        double maxAverage = students.stream()
                .mapToDouble(Marks::calculateAverage)
                .max()
                .orElse(0.0); // если нет студентов, возвращаем 0.0

        double minAverage = students.stream()
                .mapToDouble(Marks::calculateAverage)
                .min()
                .orElse(0.0); // если нет студентов, возвращаем 0.0

        // Находим студентов с максимальным и минимальным средним баллом
        List<Student> maxStudents = new ArrayList<>();
        List<Student> minStudents = new ArrayList<>();

        students.stream()
                .filter(student -> calculateAverage(student) == maxAverage)
                .forEach(maxStudents::add);

        students.stream()
                .filter(student -> calculateAverage(student) == minAverage)
                .forEach(minStudents::add);

        // Выводим студентов с максимальным и минимальным средним баллом
        System.out.println("Студенты с минимальным средним баллом:");
        maxStudents.forEach(student ->
                System.out.println(student.getStudentName() + " - Средний балл: " + calculateAverage(student))
        );

        System.out.println("Студенты с максимальным средним баллом:");
        minStudents.forEach(student ->
                System.out.println(student.getStudentName() + " - Средний балл: " + calculateAverage(student))
        );
    }

    // Метод для вычисления среднего балла студента
    public static double calculateAverage(Student student) {
        List<Integer> marks = student.getMarks();
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
