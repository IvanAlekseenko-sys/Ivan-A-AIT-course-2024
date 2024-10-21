package homework_27.marathon.computerShop_marathon.controller;

import homework_27.marathon.computerShop_marathon.model.Computer;
import homework_27.marathon.computerShop_marathon.model.Laptop;
import homework_27.marathon.computerShop_marathon.model.Smartphone;

public class Shop implements ShopInterface {

    private Computer[] computers;

    // Конструктор, принимающий массив устройств
    public Shop(Computer[] computers) {
        this.computers = computers;
    }

    @Override
    public boolean addComputer(Computer computer) {
        // Проверяем, есть ли место для нового компьютера
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer; // Добавляем компьютер
                return true; // Успешно добавлено
            }
        }
        return false; // Нет места для добавления
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                double oldPrice = computers[i].getPrice();
                double newPrice = oldPrice * (1 - discountPercentage / 100);
                computers[i].setPrice(newPrice);
            }
        }
    }

    @Override
    public void printDiscountedComputers(double discountPercentage) {
        System.out.println("Компьютеры со скидкой :");
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                double originalPrice = computers[i].getPrice() / (1 - discountPercentage / 100);
                if (computers[i].getPrice() < originalPrice) {
                    System.out.println(computers[i]);
                }
            }
        }
    }

    public int totalStorage() {
        int totalStorage = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                totalStorage += computers[i].getStorage();
            }
        }
        return totalStorage;
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                totalPrice += computers[i].getPrice();
            }
        }
        return totalPrice;
    }

    public double totalMobileWeight() {
        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop) {
                totalWeight += ((Laptop) computers[i]).getWeight();
            } else if (computers[i] instanceof Smartphone) {
                totalWeight += ((Smartphone) computers[i]).getWeight();
            }
        }
        return totalWeight;
    }

    public void printAllComputers() {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                System.out.println(computers[i]);
            }
        }
    }
    @Override
    public boolean removeComputer(int index) {
        if (index >= 0 && index < computers.length && computers[index] != null) {
            computers[index] = null; // Удаляем компьютер
            return true; // Успешно удалено
        }
        return false; // Компьютер не найден или индекс вне диапазона
    }
}