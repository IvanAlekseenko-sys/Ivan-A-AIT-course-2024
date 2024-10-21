package homework_27.marathon.first_try.computerShop_marathon.model;

public class Desktop extends Computer {

    private String caseType; // Tower, MiniTower, SFF)

    // Конструктор
    public Desktop(String cpu, int ram, int storage, String brand, double price, String caseType) {
        super(cpu, ram, storage, brand, price);
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    // Абстрактный метод из класса Computer
    @Override
    public String getComputerType() {
        return "Desktop";
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "caseType='" + caseType + '\'' +
                "} " + super.toString();
    }
}
