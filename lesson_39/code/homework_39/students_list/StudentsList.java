package homework_39.students_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса. Список студентов, которые записаны только на один из курсов. Условия: Используйте два HashSet для хранения студентов каждого курса. Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.
public class StudentsList {
    public static void main(String[] args) {
        List<String> mathGroup = Arrays.asList("StudentMath1", "StudentMath2", "StudentMath3", "StudentMath4", "StudentMathAndInformatics5");
        List<String> informaticsGroup = Arrays.asList("StudentInformatics1", "StudentInformatics2", "StudentInformatics3", "StudentInformatics4", "StudentMathAndInformatics5");

        System.out.println("Students from math group: ");
        printList(mathGroup);
        System.out.println("-----------------------------------------");
        System.out.println("Students from informatics group: ");
        printList(informaticsGroup);
        System.out.println("------------------------------------------");
        System.out.println("Students from math and informatics groups: " + findCommonStudents(mathGroup, informaticsGroup));

    }

    //print
    public static void printList(List<String> group) {
        for (String student : group) {
            System.out.println(student);
        }
    }

    //findCommonStudents
    private static List<String> findCommonStudents(List<String> mathGroup, List<String> informaticsGroup) {
        HashSet<String> setA = new HashSet<>(mathGroup);
        List<String> commonStudents = new ArrayList<>();

        // Обойдем setA и по ходу обхода будем сравнивать элементы со списком informaticsGroup
        for (String s : informaticsGroup) {
            if (setA.contains(s)) {
                commonStudents.add(s);
            }
        }

        if (commonStudents.isEmpty()) {
            System.out.println("There are no common students");
            return null;
        }
        return commonStudents;
    }
}
