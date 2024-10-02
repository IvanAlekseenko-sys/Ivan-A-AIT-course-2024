package homework;

public class CurrencyConverterEurToGbp {

    public static void main(String[] args) {
        double euros = 100.0;
        double Gbp = euToGbp (euros);
        System.out.println(euros + " евро = " + Gbp + " фунтов стерлингов");
    }//end of main

    private static final double EUR_TO_GBP = 1.18;
     public static double euToGbp(double euros) {
        return euros * EUR_TO_GBP;
    }


}//end of class
