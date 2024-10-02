package homework_07;
//Программа получает на вход строку и число повторений этой строки.
//Программа должна вывести эту строку нужное количество раз.
//Пример: строка - молоко, кол-во раз 3 молоко молоко молоко


import java.util.Scanner;

public class Line {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите название строки");
        String nameOfLine = scanner.nextLine(); // Input строки
        System.out.println("Введите количество повторений ");
        int repeats = scanner.nextInt(); // Input повторений

        int count = 0;
        while (count < repeats) {
            System.out.print(nameOfLine + " ");
            count++; //
        }
    }// end of main
}//end of class
