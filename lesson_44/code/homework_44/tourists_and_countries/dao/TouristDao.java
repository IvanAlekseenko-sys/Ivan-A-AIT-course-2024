package homework_44.tourists_and_countries.dao;

import homework_44.tourists_and_countries.model.Tourist;

import java.util.List;
import java.util.Map;

//Какие страны наиболее популярны?
//Кто из клиентов посетил наибольшее количество стран?
public interface TouristDao {

    List<Tourist> fillListTourists();

    Map<String, Long> getMostPopularCountries(List<Tourist> tourists);

    Tourist getTouristVisitsChamp(List<Tourist> tourists);

    Tourist printList();

}
