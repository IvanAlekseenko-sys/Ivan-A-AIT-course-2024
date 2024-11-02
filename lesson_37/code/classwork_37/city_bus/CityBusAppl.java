package classwork_37.city_bus;

//- создать список городских маршрутов на основе автобусов из городского автопарка;
//- отсортировать автобусы в порядке убывания их вместимости;
//- подсчитать общую вместимость автобусов из автопарка.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        List<Bus> cityBusList = new ArrayList<>();
        cityBusList.add(new Bus("Man", "num1", "3", 35));
        cityBusList.add(new Bus("Scania", "num2", "10A", 40));
        cityBusList.add(new Bus("MAN", "num3", "10C", 25));
        cityBusList.add(new Bus("Mercedes", "num4", "10A", 35));
        cityBusList.add(new Bus("Volvo", "num5", "10A", 45));

        //print
        for (Bus bus : cityBusList) {
            System.out.println(bus);
        }
        System.out.println("----------------------------------------");
        cityBusList.sort(Bus::compareTo);
        for (Bus bus : cityBusList) {
            System.out.println(bus);
        }
        Comparator<Bus> comparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2) {
                int res = o1.getRoute().compareTo(o2.getRoute());
                return res != 0 ? res : - Integer.compare(o1.getBusCapacity(), o2.getBusCapacity());
            }
        };
        cityBusList.sort(comparator);
        System.out.println("--------------------------");
        for (Bus bus : cityBusList) {
            System.out.println(bus);
        }
    }
}
