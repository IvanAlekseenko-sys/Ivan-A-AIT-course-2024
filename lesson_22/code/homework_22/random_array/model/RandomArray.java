package homework_22.random_array.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей. Реализуйте все подсчеты методами и напишите для них тесты.
public class RandomArray {
    private int[] randomArray;
    Random random = new Random();

    public RandomArray() {
        this.randomArray = new int[100];
        generateRandomArray();
    }

    // генерация массива рандомными значениями в диапазоне от -10 до 10
    private void generateRandomArray() {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21) - 10;
        }
    }

    public int[] getRandomArray() {
        return randomArray;
    }


    public int countPositiveNumbers() {
        int count = 0;
        for (int num : randomArray) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeNumbers() {
        int count = 0;
        for (int num : randomArray) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public int countEvenNumbers() {
        int count = 0;
        for (int num : randomArray) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countZeros() {
        int count = 0;
        for (int num : randomArray) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomArray that)) return false;
        return Objects.deepEquals(randomArray, that.randomArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(randomArray);
    }

    @Override
    public String toString() {
        return "RandomArray{" +
                "randomArray=" + Arrays.toString(randomArray) +
                '}';
    }


}

