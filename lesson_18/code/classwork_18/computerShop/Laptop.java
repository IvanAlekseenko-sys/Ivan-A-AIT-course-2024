package classwork_18.computerShop;

import classwork_18.computerShop.model.Computer;

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

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}//end of class
