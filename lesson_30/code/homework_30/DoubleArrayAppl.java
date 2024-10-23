package homework_30;

import java.util.Arrays;
import java.util.Comparator;

//Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортировки:
//ascending; //
//descending. //
public class DoubleArrayAppl {

    public static void main(String[] args) {
        Double[] array = new Double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 11;
        }
        System.out.println("------------Print as is------------");
        printArray(array);
        System.out.println("------------Print sorted ascending------------");
        Arrays.sort(array);
        printArray(array);
        System.out.println("------------Print sorted descending------------");
        Arrays.sort(array, Comparator.reverseOrder());
        printArray(array);

    }

    public static void printArray(Double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}//end of class