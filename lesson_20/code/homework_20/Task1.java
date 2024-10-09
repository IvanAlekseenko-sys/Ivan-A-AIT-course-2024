package homework_20;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String num = scanner.nextLine();
        int x = Integer.parseInt(num);
        int sum = 0;
        //считаем сумму введенных чисел
        while (x > 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }
        System.out.println("Сумма введенных чисел равна: " + sum);

    }//end of main

}//end of class

