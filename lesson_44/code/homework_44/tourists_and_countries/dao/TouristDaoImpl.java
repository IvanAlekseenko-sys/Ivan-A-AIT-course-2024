package homework_44.tourists_and_countries.dao;

import classwork_44.programmer_and_technologies.Programmer;
import homework_44.tourists_and_countries.model.Tourist;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TouristDaoImpl implements TouristDao {
    private List<Tourist> tourists = fillListTourists();

    public List<Tourist> fillListTourists() {
        return List.of(
                new Tourist("Olesia", List.of("Iran", "Kyrgyzstan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain")),
                new Tourist("Bilbo Baggins", List.of("Italy", "Spain", "Turkey")),
                new Tourist("Tatyana", List.of("Italy", "Spain", "Greece", "Turkey")),
                new Tourist("Anton", List.of("Germany", "Netherlands", "Turkey", "Georgia")),
                new Tourist("Sergei_B", List.of("Tunisia", "Turkey", "China", "Vietnam")),
                new Tourist("Galina", List.of("Italy", "France", "Italy")),
                new Tourist("Anatoly", List.of("Montenegro", "Albania", "Greece", "Italy")),
                new Tourist("Andrii", List.of("UK", "Ireland", "Spain")),
                new Tourist("Liubov", List.of("Croatia", "Slovenia", "Spain", "France", "Egypt")),
                new Tourist("Liam", List.of("Spain", "Portugal", "Morocco", "Cyprus")),
                new Tourist("Emma", List.of("Greece", "Turkey", "Croatia", "Montenegro")),
                new Tourist("Mia", List.of("Italy", "Malta", "Spain", "Turkey")),
                new Tourist("Noah", List.of("Turkey", "Greece", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Montenegro", "Albania", "Greece")),
                new Tourist("Lucas", List.of("Portugal", "Spain", "France", "Italy")),
                new Tourist("Amelia", List.of("Greece", "Cyprus", "Spain", "Italy")),
                new Tourist("Oliver", List.of("Spain", "Italy", "Turkey", "Greece")),
                new Tourist("Isabella", List.of("France", "Spain", "Italy", "Greece")),
                new Tourist("Ethan", List.of("Italy", "Greece", "Spain", "Croatia")),
                new Tourist("Ava", List.of("Greece", "Turkey", "Spain", "Italy")),
                new Tourist("Sophia", List.of("Italy", "Spain", "Turkey", "Greece")),
                new Tourist("Jackson", List.of("Greece", "Spain", "Italy", "Croatia")),
                new Tourist("Logan", List.of("Spain", "Greece", "Italy", "Turkey")),
                new Tourist("Emma", List.of("Greece", "Italy", "Spain", "Cyprus")),
                new Tourist("Aiden", List.of("Italy", "Greece", "Spain", "Turkey"))
        );

    }

    @Override
    public Map<String, Long> getMostPopularCountries(List<Tourist> tourists) {
        Map<String, Long> mostPopularCountries = tourists.stream()
                .map(Tourist::getCountry) // получаем список стран каждого туриста
                .flatMap(List::stream) // объеденяем списки в единый поток
                .collect(Collectors.groupingBy(
                        country -> country,
                        Collectors.counting()
                ));
        return new TreeMap<>(mostPopularCountries); //возвращаем в виде TreeMap для сортировки по алфавиту
    }


    @Override
    public Tourist getTouristVisitsChamp(List<Tourist> tourists) {
        Map<Integer, List<Tourist>> touristVisitsChamp = tourists.stream()
                .collect(Collectors.groupingBy(p -> p.getCountry().size()));
        touristVisitsChamp.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("---------------------------");
        int max = touristVisitsChamp.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        List<Tourist> champ = tourists.stream()
                .filter(tourist -> tourist.getCountry().size() == max)
                .toList();
        System.out.println(champ);
        return champ.isEmpty() ? null : champ.get(0);
    }


    @Override
    public Tourist printList() {
        fillListTourists().forEach(System.out::println);
        return null;
    }


}
