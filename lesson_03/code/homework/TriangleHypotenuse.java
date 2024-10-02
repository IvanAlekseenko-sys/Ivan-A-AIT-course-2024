package homework;
//Написать аппликацию (класс) с методами для вычисления различных величин
//Гипотенузу по двум катетам (теорема Пифагора).

public class TriangleHypotenuse {

    public static void main(String[] args) {
        double leg1 = 3;
        double leg2 = 4;

        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        System.out.println("Гипотенуза для катетов " + leg1 + " и " + leg2 + " = " + hypotenuse);

        // Solution with method
        double hypotenuseMethod = calculateHypotenuse(leg1, leg2);
        System.out.println("Гипотенуза для катетов " + leg1 + " и " + leg2 + " = " + hypotenuseMethod);
    }//end of main

    private static double calculateHypotenuse(double cathetus1, double cathetus2) {
        double hypotenuse = Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
        return hypotenuse;
    }

} // end of class
