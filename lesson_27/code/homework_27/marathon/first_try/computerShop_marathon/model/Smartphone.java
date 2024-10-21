package homework_27.marathon.first_try.computerShop_marathon.model;

public class Smartphone extends Laptop {
    private long imei;

    public Smartphone(String cpu, int ram, int storage, String brand, double price, double screenSize, double weight, int batteryLife, String color, long imei) {
        super(cpu, ram, storage, brand, price, screenSize, weight, batteryLife, color);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                "} " + super.toString();
    }

    @Override
    public String getComputerType() {
        return "Smartphone";
    }
}
