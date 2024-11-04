package classwork_38.linked_list_test;

import java.util.*;

// заполнить список случайными целыми числами
// проверить работу методов LinkedList
public class LinkedListAppl {
    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // определяем имплементацию
        fillList(list);//creation
        printList(list);// reading

        System.out.println(list.get(0)); // первый элемент списка
        System.out.println(list.get(list.size() - 1)); //последний элемент списка


        System.out.println(list.indexOf(11));

        list.set(0, 50);
        list.set(list.size() - 1, 100);
        System.out.println(list);
        list.set(5, 200);
        printList(list);


        //NB! Так удалять не нужно
        //удалить 15, если оно есть в списке
//        for (Integer num : list) {
//         if(num==15){
//             list.remove(num);
//         }
//         printList(list);
//        }
//Remove через итератор
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num.equals(15)) {
                iterator.remove();// удаление в позиции курсора итератора
            }
        }
        printList(list);

        list.remove(list.indexOf(100));
        printList(list);

        //удаление по условию через предикат, лямбда
        //удалим все элементы кратные 3
        list.removeIf(e -> e % 3 == 0);
        printList(list);
    }//end of main

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }


    }

}
