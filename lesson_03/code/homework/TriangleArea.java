package homework;
//Написать аппликацию (класс) с методами для вычисления различных величин
//Площадь треугольника по стороне и высоте треугольника.

public class TriangleArea {

    public static void main(String[] args) {
        double base = 10;
        double height = 5;


        double area = 0.5 * base * height;
        System.out.println("Площадь треугольника со стороной " + base + " и высотой " + height + " = " + area);

        // Solution with method
        double areaMethod = calculateArea(base, height);
        System.out.println("Площадь треугольника со стороной " + base + " и высотой " + height + " = " + areaMethod);
    }//end of main


    private static double calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

} // end of class