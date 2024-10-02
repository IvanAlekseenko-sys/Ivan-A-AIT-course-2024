package homework_09;

import java.util.Scanner;
import java.util.InputMismatchException;

//Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак. Используйте цифры для кодирования вариантов действий.
public class TrashSort {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в сортировочный центр мусора. ");
        Scanner scanner = new Scanner(System.in);
        //используем команду try catch, чтобы предотвратить ошибку при вводе символов отличных от цифр.
        try {
            System.out.println(" Выберите тип мусора: 1 - упаковка, 2 - пищевые отходы, 3 - бумага, 4 - прочий мусор, 5 - отмена");
            int action = scanner.nextInt();

            switch (action) {
                case 1 -> {
                    System.out.println("Данный тип мусора необходимо выбросить в желтый бак.");
                }
                case 2 -> {
                    System.out.println("Данный тип мусора необходимо выбросить в коричневый бак.");
                }
                case 3 -> {
                    System.out.println("Данный тип мусора необходимо выбросить в зеленый бак.");
                }
                case 4 -> {
                    System.out.println("Данный тип мусора необходимо выбросить в черный бак.");
                }
                case 5 -> {
                    System.out.println("Операция отменена.");
                }
                default -> System.out.println("Неверный ввод. Операция отменена.");
            }//end of switch
        } catch (InputMismatchException e) {
            //  если пользователь введет что-то кроме числа
            System.out.println("Ошибка ввода! Операция завершена.");
        }


    }//end of main


}//end of class
