package classwork3;

//Вычислить длину окружности по ее радиусу.
//Задайте радиус окружности как переменную типа double.
//Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу.

public class Circle2 {

    public static void main(String[] args) {
        double pi = Math.PI;
        double r = 33;
        double l = lengthOfCircleMethod(r);
        System.out.println("R = " + l);
    } // end of main

       private static double lengthOfCircleMethod (double r){
        double res = Math.PI * r;
        return res;
    }

}//end of class
