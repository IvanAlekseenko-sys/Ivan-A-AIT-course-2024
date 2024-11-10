package homework_42;

import java.util.HashMap;
import java.util.Map;

//Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли. Подсчитайте количество стран на континентах из полученного списка.

public class ContinentsCountries {
    public static void main(String[] args) {
        Map<String, String> countriesContinents = new HashMap<>();
        countriesContinents.put("Germany", "Europe");
        countriesContinents.put("Italy", "Europe");
        countriesContinents.put("Greece", "Europe");
        countriesContinents.put("The Netherlands", "Europe");
        countriesContinents.put("The United Kingdom", "Europe");
        countriesContinents.put("China", "Asia");
        countriesContinents.put("Japan", "Asia");
        countriesContinents.put("India", "Asia");
        countriesContinents.put("South Korea", "Asia");
        countriesContinents.put("Israel", "Asia");
        countriesContinents.put("South Africa", "Africa");
        countriesContinents.put("Senegal", "Africa");
        countriesContinents.put("Rwanda", "Africa");
        countriesContinents.put("The United States of America", "North America");
        countriesContinents.put("Canada", "North America");
        countriesContinents.put("Brazil", "South America");
        countriesContinents.put("Argentina", "South America");
        countriesContinents.put("Chile", "South America");
        countriesContinents.put("Australia", "Australia");

        System.out.println("-------List of countries and their continents-------");
        countriesContinents.entrySet().forEach(System.out::println);

        System.out.println("-------Number of countries in Europe-------");
        int europe = 0;
        for (String eu : countriesContinents.values()) {
            if (eu.equals("Europe")) {
                europe++;
            }
        }
        System.out.println(europe);

        System.out.println("-------Number of countries in Asia-------");
        int asia = 0;
        for (String as : countriesContinents.values()) {
            if (as.equals("Asia"))
                asia++;
        }
        System.out.println(asia);

        System.out.println("-------------Number of countries in Africa--------");
        int africa = 0;
        for (String af : countriesContinents.values()) {
            if (af.equals("Africa")) {
                africa++;

            }
        }
        System.out.println(africa);

        System.out.println("-------------Number of countries in North America--------");
        int northAmerica = 0;
        for (String na : countriesContinents.values()) {
            if(na.equals("North America")){
                northAmerica++;
            }
        }
        System.out.println(northAmerica);

        System.out.println("-------------Number of countries in South America--------");
        int southAmerica = 0;
        for (String sa : countriesContinents.values()) {
            if(sa.equals("South America")){
                southAmerica++;
            }
        }
        System.out.println(southAmerica);

        System.out.println("-------------Number of countries in Australia--------");
        int australia = 0;
        for (String au : countriesContinents.values()) {
            if(au.equals("Australia")){
                australia++;
            }
        }
        System.out.println(australia);

    }
}
