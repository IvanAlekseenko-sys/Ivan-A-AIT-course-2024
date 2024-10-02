package homework;

public class DistanceConverter {

    private static final double MILES_TO_KM_CONVERSION_FACTOR = 1.852;

    public static void main(String[] args) {
        double miles = 55;

        double kilometers = convertMilesToKm(miles);
        System.out.println("55 miles in kilometers = " + kilometers);
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM_CONVERSION_FACTOR;
    }
}
