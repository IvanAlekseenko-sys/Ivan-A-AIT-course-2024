package homework_22.random_array;

import homework_22.random_array.model.RandomArray;

import java.util.Arrays;

public class RandomArrayApp {
    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();

        int[] array = randomArray.getRandomArray();

        System.out.println("Массив: " + Arrays.toString(array));

        int positiveCount = randomArray.countPositiveNumbers();
        int negativeCount = randomArray.countNegativeNumbers();
        int evenCount = randomArray.countEvenNumbers();
        int zeroCount = randomArray.countZeros();

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нулей: " + zeroCount);

    }// end of main

}// end of class