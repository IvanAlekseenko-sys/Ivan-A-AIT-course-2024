package homework;
//Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

public class Minimum {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;
        int minValue = minimum(a, b);
        System.out.println("Minimum " + minValue);


    }//end of main

    public static int minimum(int a, int b) {
        int min;
        if (a < b) {

            min = a;
        } else {
            min = b;
        }
        return min;

    }


}//end of class
