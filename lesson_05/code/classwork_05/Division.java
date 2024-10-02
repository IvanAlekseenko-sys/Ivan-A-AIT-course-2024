package classwork_05;
//Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {
    public static void main(String[] args) {
    int a = 45;
    int b = 9;
    boolean res = isDivided(a,b);

        System.out.println("a = " + a + " , b = " + b + " is divided " + res);

    }// end of main

    //method
    public static boolean isDivided(int a, int b){
        return a % b == 0;


    }//end of isDivided

}// end of class
