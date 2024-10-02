package homework_13;

import java.util.Random;

//Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка. Запишите результаты в массив.
//Рассчитайте вероятность выпадения орла и решки.
public class TossCoin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] toss = new int[100];
        int countHeads = 0;
        int countTails = 0;
        System.out.println("Toss the coin 1 is for Heads, 2 is for Tails: ");
        for (int i = 0; i < toss.length; i++) {
            int n = random.nextInt(2) + 1;
            toss[i] = n;
            if (n == 1) {
                countHeads++;
            } else {
                countTails++;
            }
            System.out.print(n + " ");


        }
        System.out.println();
        //выводим результат
        System.out.println("Number of heads: " + countHeads);
        System.out.println("Number of tails: " + countTails);

        // Вероятность выпадения орел-решка
        double probabilityHeads = (double) countHeads / toss.length;
        double probabilityTails = (double) countTails / toss.length;

        System.out.println("Probability of heads: " + probabilityHeads);
        System.out.println("Probability of tails: " + probabilityTails);

    }//end of main
}//end of class
