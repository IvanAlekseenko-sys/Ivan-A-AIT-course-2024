package homework_43.boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Нужно создать набор яхт и выполнить следующие задачи:
//отобразить все яхты;отобразить яхты, сделанные из указанного материала корпуса;
//отобразить яхты дороже указанной цены;
//отобразить яхты, чей год выпуска находится в заданном диапазоне;
//отсортировать яхты в порядке убывания стоимости;
//получить среднюю стоимость яхты из созданного набора;
//сколько и конкретно какие яхты под каким флагом стоят в порту.
public class BoatAppl {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>();
        boatList.add(new Boat("Shipyard1", "USA", 2010, 30, "Wood", 50000));
        boatList.add(new Boat("Shipyard2", "France", 2015, 25, "Plastic", 75000));
        boatList.add(new Boat("Shipyard3", "Germany", 2020, 35, "Metal", 120000));
        boatList.add(new Boat("Shipyard4", "Italy", 2018, 28, "Wood", 60000));
        boatList.add(new Boat("Shipyard5", "Spain", 2012, 40, "Plastic", 85000));
        boatList.add(new Boat("Shipyard6", "UK", 2017, 50, "Metal", 200000));


        //отобразить все яхты;отобразить яхты, сделанные из указанного материала корпуса;
        System.out.println("-------------Boats list------------");
        boatList.forEach(System.out::println);

        System.out.println("------Print wood boats only-------");
        boatList.stream()
                .filter(boat -> boat.getHullMaterial().equals("Wood"))
                .forEach(System.out::println);


        //отобразить яхты дороже указанной цены;
        System.out.println("-------------Boats that cost more than 80000: ------------");
        boatList.stream()
                .filter(boat -> boat.getPrice() > 80000.0)
                .forEach(System.out::println);

        //отобразить яхты, чей год выпуска находится в заданном диапазоне;
        System.out.println("-------------Boats produced from 2015 to 2018 ------------");
        boatList.stream()
                .filter(boat -> boat.getYearOfProduction() >= 2015 && boat.getYearOfProduction() <= 2018)
                .forEach(System.out::println);

        System.out.println("-------------Boats sorted by price from expensive to cheap ones ------------");

        //отсортировать яхты в порядке убывания стоимости;
        boatList.stream()
                .sorted(Comparator.comparingDouble(Boat::getPrice).reversed())  // сортировка по убыванию стоимости
                .forEach(System.out::println);


        //получить среднюю стоимость яхты из созданного набора;
        double averagePrice = boatList.stream()
                .mapToDouble(Boat::getPrice)  // Преобразует каждый объект Boat в double
                .average()  // Вычисляет среднее значение
                .orElse(0.0);  // Если список пуст, возвращает 0.0

        System.out.println("---------------------------------");
        System.out.println("Average price of all boats: " + averagePrice);

        System.out.println("---------------Boats with indication of flag and quantity----------------------");
        //сколько и конкретно какие яхты под каким флагом стоят в порту.
        Map<String, List<Boat>> boatsByFlag = boatList.stream()
                .collect(Collectors.groupingBy(Boat::getFlag));  // Группируем яхты по флагу

        boatsByFlag.forEach((flag, boats) -> {
            System.out.println("Flag: " + flag);
            System.out.println("Boats quantity: " + boats.size());
            boats.forEach(System.out::println);  // Выводим список яхт для этого флага
        });
    }


}
