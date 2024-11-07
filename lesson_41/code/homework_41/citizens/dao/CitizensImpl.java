package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O - ??? O(n), так как при добавлении элемента необходимо найти его место в отсортированных списках и вставить его с учетом порядка, что занимает время соответствующее количеству элементов в списке.
    @Override
    public boolean add(Person person) {
        // что проверяем? проверяем чтобы объект person не был равен null
        if (person == null) {
            return false;
        }
        // что делает этот код? проверяет есть ли искомый объект person в списке
        int index = Collections.binarySearch(idList, person); // что делаем? используем метод Collections байнари сёрч для поиска person по id в idList и возвращаем индекс
        if (index >= 0) { // что делаем, если index >= 0? если индекс больше или равен 0 то, такой объект уже есть в списке и тогда возвращаем false, тем самым объект дубликат не добавляется в список
            return false;
        }
        index = -index - 1; // что делаем с index? зачем? если прилетает отрицательный индекс, то меняем его на положительный - 1, тем самым мы находим правильное место для добавления элемента
        idList.add(index, person); // что делаем? добавляем элемент в список на место определенным выше индексом
        // что делается в методе далее? метод возрастным компаратором проверяет, нет ли в ageList уже такого же объекта, если нет, то ему определяется нужная позиция и объект добавляется, далее то же самое происходит со списком lastNameList.
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true;
    }

    // O - ??? Удаление выполняется с использованием remove, сложность O(n), так как remove может сместить элементы списка.
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O - ??? Операция имеет сложность O(log n), так как использует binarySearch для поиска по отсортированному списку idList.
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O - ???Сложность — O(log n + m), где log n от binarySearch, а m — количество элементов в возвращаемом подсписке.
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O - ??? сложность идентична предыдущему методу
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // O - ??? Метод возвращает список напрямую, поэтому сложность — O(1).
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O - ??? Метод возвращает список напрямую, поэтому сложность — O(1).
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O - ??? Метод возвращает список напрямую, поэтому сложность — O(1).
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O - ??? Сложность — O(1), так как метод просто возвращает размер idList.
    @Override
    public int size() {
        return idList.size();
    }
}
