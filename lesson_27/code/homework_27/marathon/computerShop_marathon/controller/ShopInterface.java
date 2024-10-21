package homework_27.marathon.computerShop_marathon.controller;


import homework_27.marathon.computerShop_marathon.model.Computer;

public interface ShopInterface {

    // Добавить устройство в магазин
    boolean addComputer(Computer computer);

    // Применить скидку на устройство (20% на Black Friday)
    void applyDiscount(double discountPercentage);

    // Вывести устройства со скидкой
    void printDiscountedComputers(double discountPercentage);

    // Посчитать общий объем памяти всех устройств
    int totalStorage();

    // Посчитать общую стоимость всех устройств
    double totalPrice();

    // Найти вес всех мобильных устройств
    double totalMobileWeight();

    // Вывести информацию о всех устройствах
    void printAllComputers();
}