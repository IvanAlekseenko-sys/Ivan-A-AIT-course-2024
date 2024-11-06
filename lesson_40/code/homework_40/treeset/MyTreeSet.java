package homework_40.treeset;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавляем элементы
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); // Дубликат не будет добавлен

        // Выводим TreeSet
        System.out.println("TreeSet: " + numbers); //сортируется в восходящем порядке

        // Проверка наличия элемента
        System.out.println("Содержит 10? " + numbers.contains(10));

        // Первый и последний элементы
        System.out.println("Первый элемент: " + numbers.first());
        System.out.println("Последний элемент: " + numbers.last());

        // Элемент выше и ниже 15
        System.out.println("Элемент выше 15: " + numbers.higher(15));
        System.out.println("Элемент ниже 15: " + numbers.lower(15));

        // Выборка от 5 до 15 (15 не будет включено)
        System.out.println("набор от 5 до 15: " + numbers.subSet(5, 15));
    }
}
