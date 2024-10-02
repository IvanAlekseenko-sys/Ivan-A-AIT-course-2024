package homework;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // старт сканера
        System.out.println("Введите номер месяца (от 1 до 12): ");
        int month = scanner.nextInt(); // Ввод месяца


        switch (month) {// определяем время года через switch
            case 12, 1, 2: {
                System.out.println("Время года для месяца " + month + ": Зима");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Время года для месяца " + month + ": Весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Время года для месяца " + month + ": Лето");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Время года для месяца " + month + ": Осень");
                break;
            }
            default: {
                System.out.println("Некорректный ввод! Пожалуйста, введите число от 1 до 12.");
                break;
            }
        }
    }//end of main
}//end of class