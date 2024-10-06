package homework_17.additionalHW;

import java.util.Scanner;

//По данному числу n закончите фразу “На лугу пасется...” одним из возможных продолжений: “n коров“, “n корова“, “n коровы“, правильно склоняя слово “корова“.
//Входные данные: Дано целое положительное число n (n <= 10),
//Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.
public class Cows {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число от 1 до 10");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("На лугу пасется " + n + " корова");
                break;
            } else if (n == 2 || n == 3 || n == 4) {
                System.out.println("На лугу пасутся " + n + " коровы");
                break;
            } else if (n == 5 || n == 6 || n == 7 || n == 8 || n == 9 || n == 10) {
                System.out.println("На лугу пасутся " + n + " коров");
                break;
            } else {
                System.out.println("Ошибка ввода, попробуйте еще раз.");
            }
        }
    }//end of main

}//end of class

