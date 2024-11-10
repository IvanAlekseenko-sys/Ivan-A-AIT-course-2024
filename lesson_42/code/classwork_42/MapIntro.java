package classwork_42;

import java.util.*;

//сформируем Map - города и их населения
public class MapIntro {
    public static void main(String[] args) {
        //   K      V
        Map<String, Integer> cityMap = new TreeMap<>();
        cityMap.put("Hamburg", 1_800_000);
        cityMap.put("Berlin", 3_500_000);
        cityMap.put("Munich", 1_500_000);
        cityMap.put("Cologne", 1_080_000);
        cityMap.put("Ingolstadt", 140_000);
        cityMap.put("Augsburg", 350_000);
        cityMap.put("Isny", 14_835);
        cityMap.put("Odessa", 1_500_000);

        System.out.println(cityMap.size()); // 8
        System.out.println(cityMap.isEmpty());//false
        Integer population = cityMap.get("Ingolstadt");
        System.out.println(population);
        population = cityMap.get("Cologne");
        System.out.println(population);


        System.out.println("--------containsKey--------");
        System.out.println(cityMap.containsKey("Isny"));//true
        System.out.println(cityMap.containsKey("Willich"));//false


        System.out.println("----------------totalPopulation--------------");
        int totalPopulation = 0;
        List<Integer> tp = new ArrayList<>(cityMap.values());
        System.out.println(tp);
        //cityMap.values().forEach(p -> totalPopulation += p);
        for (Integer p : tp) {
            totalPopulation += p;

        }
        System.out.println("Total population: " + totalPopulation);

        System.out.println("---------------setOfCities--------------");
        Set<String> citySet = cityMap.keySet();

        citySet.forEach(System.out::println);

        System.out.println("----------------mapCityMap----------------");
        for (String key : cityMap.keySet()) {
            System.out.println("Key: " + key + ", value: " + cityMap.get(key));

        }



    }
}
