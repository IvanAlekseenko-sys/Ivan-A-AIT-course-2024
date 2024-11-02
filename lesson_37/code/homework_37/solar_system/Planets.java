package homework_37.solar_system;

import java.util.Objects;

//Занести планеты солнечной системы в список, содержащий:
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
//Вывести список планет отсортированный по:
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.
public class Planets implements Comparable<Planets> {
    //fields
    private String name;
    private double distanceToSun;
    private double mass;
    private int numberOfSatellites;

    public Planets(String name, double distanceToSun, double mass, int numberOfSatellites) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public double getMass() {
        return mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planets)) return false;
        return Double.compare(distanceToSun, planets.distanceToSun) == 0 && Double.compare(mass, planets.mass) == 0 && numberOfSatellites == planets.numberOfSatellites && Objects.equals(name, planets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToSun, mass, numberOfSatellites);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToSun=").append(distanceToSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfSatellites=").append(numberOfSatellites);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Planets o) {
        return Double.compare(this.getDistanceToSun(),o.getDistanceToSun());
    }

}
