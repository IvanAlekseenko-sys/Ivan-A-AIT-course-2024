package homework;
//Задача 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
//Напишите программу, которая ищет счастливый пельмень.
import java.util.Random;

public class Pelmeni {
    public static void main(String[] args) {
        // Количество пельменей
        int numberOfPelmeni = 30;
        // Массив для хранения весов пельменей
        int[] pelmeniWeights = new int[numberOfPelmeni];

        // Заполнение массива весами пельменей (от 20 до 30 граммов)
        Random random = new Random();
        for (int i = 0; i < numberOfPelmeni; i++) {
            pelmeniWeights[i] = 20 + random.nextInt(11); // случайный вес от 20 до 30 граммов
        }

        // Выбираем случайный пельмень, в который положим монету
        int luckyPelmeniIndex = random.nextInt(numberOfPelmeni);
        pelmeniWeights[luckyPelmeniIndex] += 15; // Увеличиваем вес на 15 граммов

        // Поиск "счастливого" пельменя
        for (int i = 0; i < numberOfPelmeni; i++) {
            // Проверяем, если вес пельменя равен 15 граммов больше, чем вес без монеты
            if (pelmeniWeights[i] == (pelmeniWeights[luckyPelmeniIndex] - 15 + 15)) {
                System.out.println("Счастливый пельмень найден на индексе: " + i);
                break;
            }
        }
    }//end of main
}//end of class