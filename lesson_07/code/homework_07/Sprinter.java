package homework_07;

//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
//Определите номер того дня, на который пробег спортсмена составит не менее target километров.
//Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class Sprinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уточните количество километров, которые вы пробежали в первый день");
        double s = scanner.nextInt();
        System.out.println("Уточните желаемое количество километров, которое Вы бы хотели достичь");
        int target = scanner.nextInt();
        int dayCounter = 0;

        while (s < target) {
            s = s + s * 0.10;
            dayCounter++;

        }
        System.out.println("Результат был достигнут на " + dayCounter + " день");

    }//end of main

}//end of class
