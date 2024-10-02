package classwork3;

//Вычислить площадь прямоугольника.
//Задайте длину и ширину прямоугольника как переменные типа double.
//Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.
public class Rectangle {
    public static void main(String[] args) {

        double l = 125.37d;
        double w = 35.0;
        // solution 1
        double area = l * w;
        System.out.println("Area of rectangle:" + area);

        //solution with method

        area = areaOfRectangle(l, w);
        System.out.println("Area of rectangle with method:" + area);

    }// end of main

    public static double areaOfRectangle(double l, double w) {

        double res = l * w;
        return res;


    }


} // end of class
