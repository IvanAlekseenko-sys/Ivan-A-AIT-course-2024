package homework_08;
//В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
//Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
//Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
//Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you a student? Enter 1 - yes, 2 - no ");
        int studentStatus = scanner.nextInt();

        System.out.println("Would you like to have a VIP seat? (The price is 25% higher than the standard one). Enter 1 - yes, 2 - no ");
        int VIP = scanner.nextInt();

        double finalPrice = calculateTicketPriceMethod(age, studentStatus, VIP);

        System.out.println("The price of your ticket is " + finalPrice);
    }

    private static double calculateTicketPriceMethod(int age, int studentStatus, int VIP) {
        double standardT = 10;
        double price = 0;

        // если выбран вип наценка от базовой цены +25%
        if (VIP == 1) {
            price = standardT + (standardT * 0.25);
        } else {
            // Если не VIP, то проверяем скидки для студентов и пенсионеров
            if (age > 67) {
                price = standardT - (standardT * 0.25); // скидка пенсионера
            } else if (studentStatus == 1) {
                price = standardT - (standardT * 0.10); // скидка студента
            } else {
                price = standardT; // в противном случае стандартная цена
            }
        }
        return price;
    }//end of calculateTicketPriceMethod

}//end of class
