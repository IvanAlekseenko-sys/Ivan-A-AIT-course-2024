package homework_27.marathon.first_try.computerShop_marathon.model;

public abstract class Computer {

    private String cpu;
    private int ram;
    private int storage;
    private String brand;
    private double price;

    // Конструктор
    public Computer(String cpu, int ram, int storage, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getComputerType(); // абстрактный метод для типа компьютера

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
