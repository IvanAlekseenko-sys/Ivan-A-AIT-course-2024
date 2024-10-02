package homework;

//Написать аппликацию (класс) с методами для вычисления различных величин
//Величину 3-го угла треугольника по известным первым двум.

public class TriangleAngles {

    public static void main(String[] args) {
        double A = 60;
        double B = 45;
        double C = 180 - A - B;

        System.out.println("Угол A = " + A + ", угол B = " + B + ", угол C = " + C);

        //  solution with method
        double thirdAngle = calculateThirdAngle(A, B);
        System.out.println("Угол A = " + A + ", угол B = " + B + ", угол C = " + thirdAngle);


    }//end of main


    private static double calculateThirdAngle(double A, double B) {
        double thirdAngle = 180 - A - B;
        return thirdAngle;
    }

} // end of class