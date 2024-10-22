package classwork_28.car_garage.ait.cars.car_sorting.model;

import java.util.Objects;

public class Car implements Comparable <Car> {

    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;
    private double price;
    private int productionYear;

    public Car(String regNumber, String model, String company, double engine, String color, double price, int productionYear) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.price = price;
        this.productionYear = productionYear;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", productionYear=").append(productionYear);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(engine, car.engine) == 0 && Double.compare(price, car.price) == 0 && productionYear == car.productionYear && Objects.equals(regNumber, car.regNumber) && Objects.equals(model, car.model) && Objects.equals(company, car.company) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, model, company, engine, color, price, productionYear);
    }

    @Override
    public int compareTo(Car car) {
        return this.getModel().compareTo(car.getModel());
    }
}//end of class
