package homework_13;

import classwork_13.array_methods.ArrayMethods_old;

//Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
//Метод должен создать новый массив длиной newLength. В новый массив должны быть скопированы элементы из входящего массива:
//Пример: Исходный массив: {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
public class C_array {
    public static void main(String[] args) {
        //Объявляем новый массив
        int[] originalArray = ArrayMethods_old.fillArray(1, 10, 10);
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " "); // Печатаем массив
        }
        System.out.println(); //
        int newLengthArray = 3; // Длина нового массива
        int[] copiedArray = copyOfArray(originalArray, newLengthArray); //копируем массив через метод

        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " "); // Печатаем массив
        }
        System.out.println();

    }//end of main

    // Метод для копирования массива
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength]; // Создаём новый массив

        // Копируем элементы массива
        for (int i = 0; i < newLength && i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray; // Возвращаем новый массив
    }
}//end of class



