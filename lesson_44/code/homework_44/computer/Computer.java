package homework_44.computer;

import java.util.Objects;

public class Computer {
    //fields
    private String brand;
    private String processor;
    private int ram;
    private int storage;
    private double price;
    private String operatingSystem;

    public Computer(String brand, String processor, int ram, int storage, double price, String operatingSystem) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && storage == computer.storage && Double.compare(computer.price, price) == 0 && Objects.equals(brand, computer.brand) && Objects.equals(processor, computer.processor) && Objects.equals(operatingSystem, computer.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, processor, ram, storage, price, operatingSystem);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", processor='").append(processor).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", storage=").append(storage);
        sb.append(", price=").append(price);
        sb.append(", operatingSystem='").append(operatingSystem).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
