package homework_11;

import java.util.Random;

//У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
//Ответьте на вопрос, сколько очков набрал стрелок?
//Попал ли он хоть раз в центр мишени?
public class Shooter {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int[] shoot = new int[10];
        System.out.println("The shooter shot 10 times from his gun and received the following results: ");
        for (int i = 0; i < shoot.length; i++) {
            int c = random.nextInt(10) + 1;
            shoot[i] = random.nextInt(10) + 1; // сохраняем в массив
            System.out.print(shoot[i] + " "); //

        }
        int count = 0;
        for (int i = 0; i < shoot.length; i++) {
            sum = sum + shoot[i]; // добавляем текущее число к сумме
            if (shoot[i] == 10) {
                count++; // если попадаются 10 - фиксируем

            }

        }
        System.out.println();
        System.out.println("The sum of his points is: " + sum);
        System.out.println("The shooter hit the center of the target " + count + " times.");


    }//end of main
}//end of class
