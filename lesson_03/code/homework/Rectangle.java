package homework;
//Метод вычисляющий периметр прямоугольника по двум сторонам;
//В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
//периметр прямоугольника со сторонами 1000 и 2000 равен ..


public class Rectangle {

    public static void main(String[] args) {

        double a = 1000;
        double b = 2000;
        double P = a + a + b + b;

        System.out.println("Perimeter of rectangle = " + P);

        // solution with method

        P = calculatePerimeter(a, b);
        System.out.println("Perimeter of rectangle = " + P);


    } // end of main


    private static double calculatePerimeter(double a, double b) {
        double res = 2 * (a + b);
        return res;
    }

}//end of class
