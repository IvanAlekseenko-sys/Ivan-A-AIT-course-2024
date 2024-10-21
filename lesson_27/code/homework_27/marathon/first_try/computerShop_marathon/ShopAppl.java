package homework_27.marathon.first_try.computerShop_marathon;

import homework_27.marathon.first_try.computerShop_marathon.model.Computer;
import homework_27.marathon.first_try.computerShop_marathon.model.Desktop;
import homework_27.marathon.first_try.computerShop_marathon.model.Laptop;
import homework_27.marathon.first_try.computerShop_marathon.model.Smartphone;
import homework_27.marathon.first_try.computerShop_marathon.controller.Shop;

public class ShopAppl {
    public static void main(String[] args) {
        // Создаем массив устройств
        Computer[] computers = new Computer[6];

        // Добавляем устройства в массив
        computers[0] = new Desktop("i7", 8, 256, "Acer", 1200, "Tower");
        computers[1] = new Desktop("i5", 16, 512, "HP", 1500, "Mini-Tower");
        computers[2] = new Desktop("Ryzen", 16, 1024, "Dell", 1800, "SFF");
        computers[3] = new Laptop("M1", 8, 256, "Apple", 2200, 13, 1.2, 12, "Silver");
        computers[4] = new Smartphone("A1", 8, 128, "Samsung", 1300, 6.5, 0.4, 24, "Black", 123456789L);
        computers[5] = new Smartphone("B2", 6, 256, "Xiaomi", 1000, 6.1, 0.3, 18, "Blue", 987654321L);

        // Создаем объект Shop с использованием массива компьютеров
        Shop shop = new Shop(computers);

        // Общий объем памяти устройств
        System.out.println("Общая память: " + shop.totalStorage());

        // Общая стоимость всех устройств
        System.out.println("Общая стоимость: " + shop.totalPrice());

        // Общий вес мобильных устройств
        System.out.println("Общий вес мобильных устройств: " + shop.totalMobileWeight());

        System.out.println("Компьютеры со стандартной стоимостью: ");
        shop.printAllComputers();
        // Применяем скидку на устройства (20% на Black Friday)
        shop.applyDiscount(20);

        // Устройства со скидкой
        System.out.println();
        System.out.println("Стоимость со скидкой Black Friday 20%:");
        shop.printDiscountedComputers(20);

    }
}
