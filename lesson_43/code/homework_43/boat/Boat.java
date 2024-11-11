package homework_43.boat;

import java.util.Objects;

//Создать класс «Яхта» (Boat). В классе должна храниться следующая информация:
//производитель(верфь);
//страна (флаг);
//год выпуска;
//длина;
//материал корпуса (дерево, пластик, металл);
//стоимость.
public class Boat {
    //fields
    private String shipyard;
    private String flag;
    private int yearOfProduction;
    private int length;
    private String hullMaterial;
    private double price;

    public Boat(String shipyard, String flag, int yearOfProduction, int length, String hullMaterial, double price) {
        this.shipyard = shipyard;
        this.flag = flag;
        this.yearOfProduction = yearOfProduction;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getShipyard() {
        return shipyard;
    }

    public void setShipyard(String shipyard) {
        this.shipyard = shipyard;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat boat)) return false;
        return yearOfProduction == boat.yearOfProduction && length == boat.length && Double.compare(price, boat.price) == 0 && Objects.equals(shipyard, boat.shipyard) && Objects.equals(flag, boat.flag) && Objects.equals(hullMaterial, boat.hullMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipyard, flag, yearOfProduction, length, hullMaterial, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("shipyard='").append(shipyard).append('\'');
        sb.append(", flag='").append(flag).append('\'');
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append(", length=").append(length);
        sb.append(", hullMaterial='").append(hullMaterial).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
