package homework_27.marathon.computerShop_marathon.model;

public class Laptop extends Computer {
    private double screenSize;
    private double weight;
    private int batteryLife;
    private String color;

    public Laptop(String cpu, int ram, int storage, String brand, double price, double screenSize, double weight, int batteryLife, String color) {
        super(cpu, ram, storage, brand, price);
        this.screenSize = screenSize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getComputerType() {
        return "Laptop";
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
