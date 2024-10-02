package homework;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //  старт сканера для ввода данн. пользователем
        System.out.println("Введите номер цвета светофора (1 - красный, 2 - желтый, 3 - зеленый): ");
        int lightColor = scanner.nextInt(); // Ввод номера цвета светофора


        switch (lightColor) { // Определение действий водителя в зависимости от номера цвета светофора
            case 1: { // Красный
                System.out.println("Проезд запрещен, дождитесь зеленого цвета светофора");
                break;
            }
            case 2: { // Желтый
                System.out.println("Проезд запрещен, дождитесь зеленого цвета светофора");
                break;
            }
            case 3: { // Зеленый
                System.out.println("Проезд разрешен");
                break;
            }
            default: { // На случай некорректного ввода
                System.out.println("Пожалуйста, введите 1, 2 или 3.");
                break;
            }
        }
    }//end of main
}//end of class
