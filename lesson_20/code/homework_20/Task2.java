package homework_20;

import java.util.Scanner;

//Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Вашу фразу: ");
        String phrase = scanner.nextLine();
        //считаем количество символов в строке
        int l = phrase.length();
        System.out.println("Количество символов в строке: " + l);

        //считаем количество символов в верхнем регистре
        int upperCaseCount = 0; // переменная для подсчета символов в апперкейсе
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i); //текущий символ
            if (Character.isUpperCase(currentChar)) {
                upperCaseCount++;

            }

        }
        System.out.println("Количество символов в верхнем регистре: " + upperCaseCount);

        //считаем количество цифр в строке
        int isDigit = 0; // переменная для подсчета количества цифр
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i); //текущий символ
            if (Character.isDigit(currentChar)) {
                isDigit++;

            }

        }
        System.out.println("Количество цифр составляет: " + isDigit);

        //считаем количество пробелов в строке
        int spaceCounter = 0; // переменная для подсчета пробелов (код пробела 32)
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i); //текущий символ
            if (currentChar == (char) 32 ){
                spaceCounter++;

            }

        }
        System.out.println("Количество пробелов составляет: " + spaceCounter);

        //повествовательное, вопросительное или восклицательное предложение ввел пользователь?
        char lastChar = phrase.charAt(phrase.length() - 1); // Получаем последний символ

        if (lastChar == '.') {
            System.out.println("Это повествовательное предложение.");
        } else if (lastChar == '?') {
            System.out.println("Это вопросительное предложение.");
        } else if (lastChar == '!') {
            System.out.println("Это восклицательное предложение.");
        } else {
            System.out.println("Тип предложения не определен."); // Если нет ни одного из нужных знаков.
        }

    }//end of main
}//end of class
