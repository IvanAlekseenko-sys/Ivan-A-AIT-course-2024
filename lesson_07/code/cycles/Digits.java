package cycles;
//Задача пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.


import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        //5 467
        // ---------------------
        //5 467 % 10 = 7 - первая справа цифра (остаток)
        // 5 467 / 10 = 546  (целые)
        // продолжим в цикле делать деление / на 10, пока результат > 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int tempNumber = number;

        int counter = 0;

        while(number > 0) {
            number = number / 10; //number - это параметр цикла
            System.out.println(number);
            counter++;


        }

        System.out.println("Digits in number " + tempNumber + " are = " + counter);
    }//end of main



}//end of class
