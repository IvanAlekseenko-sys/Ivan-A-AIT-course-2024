package classwork;

import java.util.Random;

//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?
public class Dice {
    public static void main(String[] args) {

        Random random = new Random(); // сделали объект

       int[] toss = new int [20];
       //fill in
        for (int i = 0; i < toss.length; i++) {
            // вызов датчика случайных чисел
         int n = random.nextInt (6) + 1; //диапазон от 0 до 5 + 1 чтобы сдвинуть от 1 до 6
            toss[i] = n;
            System.out.print(n + " ");

        }
        System.out.println();


      //calculate results of tossing
        int[] res = new int[6]; //array for results объявляем
        for (int i = 0; i < toss.length; i++) {
            int p = toss[i];
            switch (p){
             case 1-> res[0]++;
             case 2-> res[1]++;
             case 3-> res[2]++;
             case 4-> res[3]++;
             case 5-> res[4]++;
             case 6-> res[5]++;


            }

        }
        //print res
        for (int i = 0; i < res.length; i++) {
            System.out.print (res[i] + " ");

        }



    }//end of main



}//end of class
