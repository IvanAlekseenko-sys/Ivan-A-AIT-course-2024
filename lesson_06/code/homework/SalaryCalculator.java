package homework;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // Старт сканера
        System.out.println("Укажите свой стаж (количество лет) : ");
        int yearsOfExperience = scanner.nextInt(); // ввод пользователем стажа


        int experienceBonus = 0; // переменная для бонуса за стаж
        int baseSalary = 500; // базовая зарплата


        switch (yearsOfExperience) { // switch для определения бонуса
            case 0, 1, 2: { // От 0 до 3 лет
                experienceBonus = 0;
                System.out.println("Стаж от 0 до 3 лет. Надбавка: 0%");
                break;
            }
            case 3, 4: { // От 3 до 5 лет
                experienceBonus = 10;
                System.out.println("Стаж от 3 до 5 лет. Надбавка: 10%");
                break;
            }
            case 5, 6, 7, 8, 9: { // От 5 до 10 лет
                experienceBonus = 50;
                System.out.println("Стаж от 5 до 10 лет. Надбавка: 50%");
                break;
            }
            case 10, 11, 12, 13, 14: { // От 10 до 15 лет
                experienceBonus = 100;
                System.out.println("Стаж от 10 до 15 лет. Надбавка: 100%");
                break;
            }
            case 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35: { // Более 15 лет
                experienceBonus = 150;
                System.out.println("Стаж более 15 лет. Надбавка: 150%");
                break;
            }
            default: { // Если введены неверные данные
                System.out.println("Wrong input!");

            }
        }


        int finalSalary = baseSalary + (baseSalary * experienceBonus / 100);      // итоговая зп с бонусом


        System.out.println("Итоговая зарплата: $" + finalSalary);     // Итоговая зп
    }
}//end of class