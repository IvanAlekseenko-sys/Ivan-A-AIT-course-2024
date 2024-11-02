package homework_37.solar_system;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {
    public static void main(String[] args) {
        List<Planets> planetsList = new ArrayList<>();
        planetsList.add(new Planets("Mercury", 0.39, 0.06, 0));
        planetsList.add(new Planets("Venus", 0.72, 0.82, 0));
        planetsList.add(new Planets("Earth", 1.00, 1.00, 1));
        planetsList.add(new Planets("Mars", 1.52, 0.11, 2));
        planetsList.add(new Planets("Jupiter", 5.20, 317.8, 67));
        planetsList.add(new Planets("Saturn", 9.54, 95.2, 62));
        planetsList.add(new Planets("Uranus", 19.18, 14.5, 27));
        planetsList.add(new Planets("Neptune", 30.06, 17.1, 14));

        System.out.println("-------------Unsorted-------------");
        for (Planets planet : planetsList) {
            System.out.println(planet);
        }
        System.out.println("-------------SortedByDistanceToSun-------------");
        planetsList.sort(Planets::compareTo);
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparatorByName = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("-------------SortedByName-------------");
        planetsList.sort(comparatorByName);
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparatorByMass = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };

        System.out.println("-------------SortedByMass-------------");
        planetsList.sort(comparatorByMass);
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparatorBySatellites = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Integer.compare(o1.getNumberOfSatellites(), o2.getNumberOfSatellites());
            }
        };

        System.out.println("-------------SortedBySatellites-------------");
        planetsList.sort(comparatorBySatellites);
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

    }
}
