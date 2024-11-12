package homework_44.tourists_and_countries;

import homework_44.tourists_and_countries.dao.TouristDao;
import homework_44.tourists_and_countries.dao.TouristDaoImpl;
import homework_44.tourists_and_countries.model.Tourist;

import java.util.List;
import java.util.Map;

public class TouristAppl {
    public static void main(String[] args) {
        System.out.println("---------------List of Tourists----------------");
        TouristDao touristDao = new TouristDaoImpl();
        touristDao.printList();

        System.out.println("-------Most popular countries to visit-------");
        // Получаем список туристов из метода fillListTourists
        List<Tourist> tourists = touristDao.fillListTourists();
        // Вызываем метод для подсчета популярных стран
        Map<String, Long> mostPopularCountries = touristDao.getMostPopularCountries(tourists);

        // Вывод результата
        mostPopularCountries.forEach((country, count) ->
                System.out.println(country + ": " + count + " time(-s) visited"));

        System.out.println("---------Tourist visits champion-----------");


        // Вызов метода для нахождения чемпиона по количеству посещенных стран
        Tourist champion = touristDao.getTouristVisitsChamp(tourists);

    }
}
