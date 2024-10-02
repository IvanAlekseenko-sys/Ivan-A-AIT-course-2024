package homework;

import classwork.ArrayMethods;

import java.util.Random;

// Часть1. Заполните массив целыми числами от 1 до 100. Создайте второй массив с размером на 1 больше, чем имеющийся.
// Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.
public class NewArray100 {

    public static void main(String[] args) {
        Random random = new Random();

        // Создаем первый массив
        int[] array100 = ArrayMethods.sequentArray(1, 100);
        ArrayMethods.printArray(array100);

        // Создаем второй массив на 1 больше предыдущего
        int[] array101 = new int[101];

        // Копируем первый массив во второй
        System.arraycopy(array100, 0, array101, 0, array100.length);
        ArrayMethods.printArray(array101);

        // Генерируем случайное число от 1 до 100
        int randomNumber = random.nextInt(100) + 1;

        // Генерируем случайный индекс для вставки
        int randomIndex = random.nextInt(array101.length);

        // Сдвигаем элементы вправо, начиная с randomIndex
        for (int i = array101.length - 1; i > randomIndex; i--) {
            array101[i] = array101[i - 1];
        }

        // Вставляем случайное число на сгенерированную позицию
        array101[randomIndex] = randomNumber;

        // Печатаем итоговый массив
        ArrayMethods.printArray(array101);

        // Находим добавленное число
        int addedNumber = findAddedNumber(array100, array101);
        System.out.println("Добавленное число: " + addedNumber);
    }

    // Метод для нахождения добавленного числа
    public static int findAddedNumber(int[] originalArray, int[] newArray) {
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != newArray[i]) {
                return newArray[i]; // Возвращаем первое найденное различие
            }
        }
        // Если все элементы совпадают, значит добавленное число в конце
        return newArray[newArray.length - 1];
    }//end of main

}//end of class
