package classwork_41.collections;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "lemon", "apricot", "peach", "pear", "avocado", "banana", "orange", "pineapple"));
        fruits.forEach(System.out::println);


        System.out.println("-----------sorting----------");
        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };

        Collections.sort(fruits); // sorting без компаратора
        fruits.forEach(System.out::println); //print
        System.out.println("---------sortingReversed---------------");

//       Collections.sort(fruits,fruitComparator);
        Collections.sort(fruits.reversed()); //sorting and rewriting collection (элементы переставляются местами)
        fruits.forEach(System.out::println); //print

        System.out.println("-----------max----------");
        System.out.println(Collections.max(fruits, fruitComparator));

        System.out.println("-----------reverse----------");
        Collections.reverse(fruits);
        fruits.forEach(System.out::println); //print


        System.out.println("------------shuffle-------------");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);



    }

}
