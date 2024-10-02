package homework;

//Написать аппликацию (класс) с методами для вычисления различных величин
//Метод вычисляющий площадь квадрата по его стороне;
//площадь квадрата со стороной 500 составляет ...

public class Square {

    public static void main(String[] args) {
        double x = 500;
        double area = x * x;
        System.out.println("Площадь квадрата = " + area);

        //solution with method

        area = areaOfSquare(x);
        System.out.println("Площадь квадрата = " + area);

    }// end of main

    private static double areaOfSquare(double x) {
        double res = x * x;
        return res;
    }

}// end of class
