package classwork_43.stream_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы, преобразуйте их в верхний регистр и выведите в алфавитном порядке.
public class CityStream {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>(Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"));
        char firstLetter = 'b';
        List<String> result = filterCites(cityList, firstLetter);


        result.forEach(System.out::println);
    }

    private static List<String> filterCites(List<String> cityList, char firstLetter) {
        return cityList.stream()
                .filter(city -> city.toLowerCase().startsWith(String.valueOf(firstLetter)))// отбор по первой букве
                .map(String::toUpperCase) //перегоняем в аппер кейс
                .sorted()// сортируем
                .toList()//добавляем в лист
                .reversed(); //разворачиваем

    }
}
