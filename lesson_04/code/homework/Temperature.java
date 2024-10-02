package homework;
//Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту.
//Формулу пересчета найти в Интернете. Вызовите метод в main.

public class Temperature {


    public static void main(String[] args) {
        double celsius = 0;

        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("0 цельсия по фаренгейту = " + fahrenheit);
    }// end of main

    public static final double CELSIUS_TO_FAHRENHEIT_CONVERSION= 1.8;
    public static final double CELSIUS_TO_FAHRENHEIT = 32.0;

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_TO_FAHRENHEIT_CONVERSION + CELSIUS_TO_FAHRENHEIT;
    }
}//end of class
