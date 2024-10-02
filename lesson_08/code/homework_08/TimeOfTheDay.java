package homework_08;

import java.util.Scanner;

//Определение времени суток. Напишите программу, которая принимает на вход текущий час (от 0 до 23)
//и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class TimeOfTheDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired hour (in range from 0 to 23)");
        int dHour = scanner.nextInt();
        switch (dHour) {
            case 5, 6, 7, 8, 9, 10, 11: {
                System.out.println("Good morning!");
                break;

            }
            case 12, 13, 14, 15, 16, 17: {
                System.out.println("Good afternoon!");
                break;

            }
            case 18, 19, 20, 21, 22: {
                System.out.println("Good evening!");
                break;

            }
            case 23, 1, 2, 3, 4: {
                System.out.println("Good night!");
                break;

            }
            default: {
                System.out.println("Wrong input!");
            }

        }
    }//end of main
}//end of class
