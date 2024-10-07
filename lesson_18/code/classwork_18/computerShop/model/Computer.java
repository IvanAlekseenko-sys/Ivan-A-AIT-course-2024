package classwork_18.computerShop.model;

//- cpu
//- ram
//- storage
//- brand
//- price

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


}//end of class
