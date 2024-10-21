package homework_27.marathon.computerShop_marathon.test;

import homework_27.marathon.computerShop_marathon.controller.Shop;
import homework_27.marathon.computerShop_marathon.model.Computer;
import homework_27.marathon.computerShop_marathon.model.Desktop;
import homework_27.marathon.computerShop_marathon.model.Laptop;
import homework_27.marathon.computerShop_marathon.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    private Shop shop;
    private Computer[] computers;

    @BeforeEach
    public void setUp() {
        // Создаем массив компьютеров для тестирования
        computers = new Computer[4];
        computers[0] = new Desktop("i7", 8, 256, "Acer", 1200, "Tower");
        computers[1] = new Laptop("M1", 16, 512, "Apple", 2200, 13, 1.2, 12, "Silver");
        computers[2] = new Smartphone("A1", 8, 128, "Samsung", 1300, 6.5, 0.4, 24, "Black", 123456789L);

        // Инициализируем магазин с массивом компьютеров
        shop = new Shop(computers);
    }

    @Test
    public void testTotalStorage() {
        int expectedStorage = 256 + 512 + 128; // Ожидаемый общий объем памяти
        assertEquals(expectedStorage, shop.totalStorage());
    }

    @Test
    public void testTotalPrice() {
        double expectedPrice = 1200 + 2200 + 1300; // Ожидаемая общая стоимость
        assertEquals(expectedPrice, shop.totalPrice());
    }

    @Test
    public void testAddComputer() {
        Computer newComputer = new Desktop("i5", 16, 512, "HP", 1500, "Mini-Tower");
        assertTrue(shop.addComputer(newComputer)); // Проверяем, что компьютер добавлен
    }

    @Test
    public void testApplyDiscount() {
        double discountPercentage = 20;
        // Применяем скидку
        shop.applyDiscount(discountPercentage);
        // Проверяем, что цена первого компьютера уменьшилась на 20%
        double expectedPrice = 1200 * (1 - discountPercentage / 100); // 960
        assertEquals(expectedPrice, computers[0].getPrice());
    }

    @Test
    public void testTotalMobileWeight() {
        // Добавляем смартфон и ноутбук для теста
        double expectedWeight = ((Laptop) computers[1]).getWeight() + ((Smartphone) computers[2]).getWeight();
        assertEquals(expectedWeight, shop.totalMobileWeight());
    }
    @Test
    public void testRemoveComputer_Success() {
        // Удаляем компьютер по индексу 0
        assertTrue(shop.removeComputer(0));
        // Проверяем, что компьютер на индексе 0 теперь равен null
        assertNull(computers[0]);
    }

}