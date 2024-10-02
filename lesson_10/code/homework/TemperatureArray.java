package homework;

//Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
//Выведите на печать температуру, которая была во вторник и затем в четверг.
//Найти среднюю температуру за прошлую неделю.
public class TemperatureArray {
    public static void main(String[] args) {
        int[] temperature = {17, 18, 20, 22, 21, 22, 22};
        int sum = 0;

        // Вывод температуры за вторник и четверг
        System.out.println("The weather on tuesday: ");
        switch (1) { // Вторник
            case 1:
                System.out.println(temperature[1] + " celsius");
                break;
        }

        System.out.println("The weather on thursday: ");
        switch (3) { // Четверг
            case 3:
                System.out.println(temperature[3] + " celsius");
                break;
        }

        //средняя температура
        for (int i = 0; i < temperature.length; i++) {
            sum = sum + temperature[i];
        }
        double averageTemp = (double) sum / temperature.length;
        System.out.println(" The average temperature in Ingolstadt for the period: 16.09 - 22.09 is  + " + averageTemp + " celsius.");


    }//end of main


}//end of class
