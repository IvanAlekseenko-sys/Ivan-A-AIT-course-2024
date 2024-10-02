package homework;
//Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.

public class MilesToKm {

    public static void main(String[] args) {
        double nauticalMiles = 1;

        double kilometers = convertNauticalMilesToKm(nauticalMiles);
        System.out.println(nauticalMiles + " морская миля в километрах = " + kilometers);
        System.out.printf("Kilometers %.2f", kilometers);
    }//end of main


    private static final double NAUTICAL_MILE_TO_METERS = 1852;


    private static final double METERS_TO_KILOMETERS = 0.001;

    public static double convertNauticalMilesToKm(double nauticalMiles) {
        return nauticalMiles * NAUTICAL_MILE_TO_METERS * METERS_TO_KILOMETERS;
    }
}//end of class
