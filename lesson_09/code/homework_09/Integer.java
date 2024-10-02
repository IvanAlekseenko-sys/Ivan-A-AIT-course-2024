package homework_09;
//Написать программу, выводящую на экран максимальное из трех целых чисел.
//Числа задайте самостоятельно внутри программы.
//Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

public class Integer {
    public static void main(String[] args) {
        int x = 111;
        int y = 434;
        int z = 332;


        //if else solution
        int ifElse = ifElseSolution(x, y, z);
        System.out.println("The maximum number is: " + ifElse + " * ifElse solution * ");

        //ternary operator solution

        int tOperator = tOperatorSolution(x, y, z);
        System.out.println("The maximum number is: " + tOperator + " * Ternary operator solution *");


    }//end of main

    public static int ifElseSolution(int x, int y, int z) {
        int max = x;

        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max < z) {
            max = z;
        }

        return max;
    }

    public static int tOperatorSolution(int x, int y, int z) {
        int maximum1 = x > y ? x : y;
        int maximum2 = z > x ? z : x;
        int maximum3 = y > z ? y : z;
        int tempMaximum = maximum1 > maximum2 ? maximum1 : maximum2;
        int absMaximum = tempMaximum > maximum3 ? tempMaximum : maximum3;
        return absMaximum;
    }


}//end of class




