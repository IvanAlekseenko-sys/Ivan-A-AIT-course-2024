package classwork_19.compare_computers;

//- cpu
//- ram
//- storage
//- brand
//- price

import java.util.Objects;

public class Computer {

    private String cpu;
    private int ram;
    private int storage;
    private String brand;
    private double price;


    public Computer(String cpu, int ram, int storage, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравниваем объект сам с собой
        if (!(o instanceof Computer computer)) return false; // это объект не из класса Computer, тогда false.
        return ram == computer.ram && storage == computer.storage && Double.compare(price, computer.price) == 0 && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, storage, brand, price);
    }

}//end of class
