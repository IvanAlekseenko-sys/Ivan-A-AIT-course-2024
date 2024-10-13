package homework_22.array.model;

import java.util.Arrays;

//Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//сумма всех элементов массива с нечетными индексами;
//поиск 5-го элемента в массиве. Разработайте тесты для этих методов.
public class ArrayMethods {

    private int[] Array;


    public ArrayMethods(int[] array) {
        Array = array;
    }

    public int[] getArray() {
        return Array;
    }

    public void setArray(int[] array) {
        Array = array;
    }

    @Override
    public String toString() {
        return "ArrayMethods{" +
                "Array=" + Arrays.toString(Array) +
                '}';
    }

    // сумма всех элементов массива с нечетными индексами
    public int sumOfOddIndexElements() {
        int sum = 0;
        for (int i = 1; i < Array.length; i = i + 2) {
            sum = sum + Array[i];

        }
        return sum;
    }
    //поиск 5 элемента в массиве
    public int findFifthElementInArray() {
        return Array[4];
    }
}

