package homework_34.time.utils;
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {

//  Этот метод принимает дату рождения в виде стринга,
//    и возвращающий возраст.

    public static int getAge(String birthDate) {
        LocalDate bDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
        LocalDate now = LocalDate.now();
        int age = (int) ChronoUnit.YEARS.between(bDate, now);
        return age;
    }


    public static String[] sortStringDates(String[] dates) {
        // Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");

        // Преобразуем строки дат в LocalDate объекты
        LocalDate[] dateObjects = new LocalDate[dates.length];
        for (int i = 0; i < dates.length; i++) {
            dateObjects[i] = LocalDate.parse(dates[i], formatter); // Парсим strings в LocalDate
        }

        // Создаем массив индексов для сортировки
        Integer[] indices = new Integer[dates.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i; // Заполняем массив индексами
        }

        // Сортируем индексы на основе значений дат
        Arrays.sort(indices, (i1, i2) -> dateObjects[i1].compareTo(dateObjects[i2]));

        // Создаем итоговый массив для отсортированных дат
        String[] sortedDates = new String[dates.length];

        // Заполняем итоговый массив с использованием отсортированных индексов
        for (int i = 0; i < indices.length; i++) {
            sortedDates[i] = dates[indices[i]]; // Берем изначальные стринги по отсортированным индексам
        }

        return sortedDates;
    }


}
