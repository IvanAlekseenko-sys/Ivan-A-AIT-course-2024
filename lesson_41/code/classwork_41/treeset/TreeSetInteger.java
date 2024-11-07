package classwork_41.treeset;

import java.util.*;

public class TreeSetInteger {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(10,20,30, -80, -230, 0));

        TreeSet<Integer> numbers = new TreeSet<>(num);

        numbers.add(40);
        numbers.add(100500);
        numbers.add(40);
        System.out.println(numbers);
        System.out.println(numbers.size());
        for (Integer n : numbers) {
            System.out.print(n + " ");

        }
        System.out.println();

        System.out.println(numbers.first());
        System.out.println(numbers.last());

        System.out.println(numbers.ceiling(1));
        System.out.println(numbers.floor(5));
        System.out.println(numbers.higher(0));
        System.out.println(numbers.higher(0));
        System.out.println(numbers.tailSet(5));
        System.out.println(numbers.subSet(-50,30));

    }
}
