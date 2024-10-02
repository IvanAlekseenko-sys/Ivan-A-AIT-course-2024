package homework;
//Написать аппликацию (класс) с методами для вычисления различных величин
//Метод вычисляющий площадь круга по его радиусу;
//площадь круга для R = 200 равна ...


public class Circle {
    public static void main(String[] args) {

        double pi = Math.PI;
        double r = 200;

        double area = pi * r * r;

        System.out.println("Area of the circle = " + area);

        // solution with method

        double m = area(r);
        System.out.println("Area of the circle = " + m);

    } // end of main

    private static double area(double r) {

        double res = Math.PI * r * r;
        return res;


    }


} // end of class
