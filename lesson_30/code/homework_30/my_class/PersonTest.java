package homework_30.my_class;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person[] persons;

    @BeforeEach
    void setUp() {
        persons = new Person[]{
                new Person("Lavrenti", 55, 80),
                new Person("George", 56, 78),
                new Person("Joseph", 57, 79),
                new Person("Feliks", 22, 75),
                new Person("Feliks", 18, 90)
        };
    }

    @Test
    void sortByWeightTest() {
        Comparator<Person> comparatorByWeight = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.getWeight(), p2.getWeight());
            }
        };

        System.out.println("------------Print as is------------");
        printArray(persons);
        Arrays.sort(persons, comparatorByWeight);
        System.out.println("------------Print sorted by weight------------");
        printArray(persons);
    }


    @Test
    void sortByNameNativeTest() {
        System.out.println("------------Print as is------------");
        printArray(persons);
        Arrays.sort(persons);
        System.out.println("------------Print sorted by name------------");
        printArray(persons);
    }

    @Test
    void sortByAgeTest() {
        Comparator<Person> comparatorByAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        System.out.println("------------Print as is------------");
        printArray(persons);
        Arrays.sort(persons, comparatorByAge);
        System.out.println("------------Print sorted by age------------");
        printArray(persons);
    }

    @Test
    void sortByNameAndAgeTest() {
        Comparator<Person> comparatorByNameAndAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return String.valueOf(p1.getName()).compareTo(String.valueOf(p2.getName())) + Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        System.out.println("------------Print as is------------");
        printArray(persons);
        Arrays.sort(persons, comparatorByNameAndAge);
        System.out.println("------------Print sorted by name and age------------");
        printArray(persons);
    }

    @Test
    void BinarySearchTest() {

        System.out.println("------------Print as is------------");
        printArray(persons);
        Arrays.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("------------Print sorted by age------------");
        printArray(persons);
        //create object pattern for searching
        Person pattern = new Person(null, 57, 0);
        int index = Arrays.binarySearch(persons, pattern, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Index of pattern = " + index);


    }

    void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}//end of class


