package cycles;
//Задача о яблоках (начальное значение 30 яблок).
//Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
//Последнее сообщение: "Яблоки кончились!".

public class Apples {

    public static void main(String[] args) {
        int apples = 30;//начальные данные
        int counter = 0;//начальное положение счетчика и параметр цикла
        int startApples = 30; // резерв
        while (counter < 30) {
            System.out.println("Take one apple from the basket. ");
            apples = apples -1; // взяли яблоко
            counter = counter +1; // производим 1 цикл
            //counter вырастет до 30, после этого мы выйдем из цикла
            System.out.println("Now we have only " + apples + " apples in the basket. ");
        }

        System.out.println("The job is done!" + counter +" apples in the basket");
    }//end of main

}//end of class
