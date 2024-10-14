package homework_23.trip.model;

import java.util.Objects;

//Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?
public class Cars {
    public static final int DISTANCE = 3000;

    //fields
    private String brand;
    private String fuelType;
    private double fuelPrice;
    private double fuelConsumption;
    private int rentPrice;


    //constructor


    public Cars(String brand, String fuelType, double fuelPrice, double fuelConsumption, int rentPrice) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.fuelPrice = fuelPrice;
        this.fuelConsumption = fuelConsumption;
        this.rentPrice = rentPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars cars)) return false;
        return Double.compare(fuelPrice, cars.fuelPrice) == 0 && Double.compare(fuelConsumption, cars.fuelConsumption) == 0 && rentPrice == cars.rentPrice && Objects.equals(brand, cars.brand) && Objects.equals(fuelType, cars.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, fuelType, fuelPrice, fuelConsumption, rentPrice);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cars{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append(", fuelPrice=").append(fuelPrice);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", rentPrice=").append(rentPrice);
        sb.append('}');
        return sb.toString();
    }

    //метод для подсчета стоимости топлива
        public double calculateFuelCost() {
            double fuelNeeded = (fuelConsumption / 100) * DISTANCE; // сколько нужно топлива на всю поездку
            return fuelNeeded * fuelPrice; // общая стоимость топлива, основанная на цене из конструктора
        }
    }

