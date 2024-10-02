package homework_07;

import java.util.Scanner;

//Вводится положительное целое число, найдите сумму его цифр.
// Пример: 1725, сумма цифр = 15
public class DigitsNew {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // извлечение последней цифры
            sum = sum + digit;// добавление цифры к сумме
            number = number / 10; // удаление последней цифры
        }

        System.out.println("The sum of all digits is " + sum);

    }//end of main


}//end of class
