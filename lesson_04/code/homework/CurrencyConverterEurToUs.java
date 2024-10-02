package homework;

public class CurrencyConverterEurToUs {
    public static void main(String[] args) {
        double euros = 100.0;
        double usDollars = convertEuroToUsd(euros, EURO_TO_USD_RATE);
        System.out.println(euros + " евро = " + usDollars + " долларов США");

    }//end of main

    private static final double EURO_TO_USD_RATE = 1.11;

    public static double convertEuroToUsd(double euros, double EURO_TO_USD_RATE ) {

        return EURO_TO_USD_RATE * euros;
    }

}//end of class