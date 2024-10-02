package homework;

//Напишите методы для конвертации валюты:
//евро в доллары США
//евро в британские фунты
//евро в китайские юани и проверьте их работу, вызвав их в main.

public class Currency {

    public static final double USD_RATE = 1.1;     // Константа для конвертации евро в доллары
    public static final double POUND_RATE = 0.8;   // Константа для конвертации евро в фунты
    public static final double YUAN_RATE = 7.8;    // Константа для конвертации евро в юани

    public static void main(String[] args) {
        double euros = 100;

        double usd = convertEurosToUSD(euros);
        System.out.println("100 евро в долларах = " + usd);

        double pounds = convertEurosToPounds(euros);
        System.out.println("100 евро в фунтах стерлингов = " + pounds);

        double yuan = convertEurosToYuan(euros);
        System.out.println("100 евро в юанях = " + yuan);
    }//end of main


    public static double convertEurosToUSD(double euros) {
        return euros * USD_RATE;
    }

    public static double convertEurosToPounds(double euros) {
        return euros * POUND_RATE;
    }

    public static double convertEurosToYuan(double euros) {
        return euros * YUAN_RATE;
    }
}//end of class