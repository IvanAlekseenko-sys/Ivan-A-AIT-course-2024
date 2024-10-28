//package homework_27.marathon.Pets_marathon.tests;
//
//import homework_27.marathon.Pets_marathon.controller.HotelImpl;
//import homework_27.marathon.Pets_marathon.model.Cat;
//import homework_27.marathon.Pets_marathon.model.Dog;
//import homework_27.marathon.Pets_marathon.model.Pet;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HotelImplTest {
//    Pet[] pets;
//    HotelImpl hotel;
//
//    @BeforeEach
//    void setUp() {
//        pets = new Pet[] {
//                new Dog(1, "Собака", 2, "Шарик", "без породы", 35, 16),
//                new Dog(2, "Собака", 5, "Палкан", "ретривер", 40, 23),
//                new Cat(3, "Кошка", 3, "Барсик", "сиамская", 20, 6)
//        };
//        hotel = new HotelImpl(pets); // Предположим, что у класса HotelImpl есть такой конструктор
//    }
//
//    @Test
//    void calcRevenue() {
//        // Предположим, что calcRevenue() возвращает сумму значений последнего параметра (веса или какого-то другого показателя)
//        int expectedRevenue = 16 + 23 + 6; // суммируем значения последних параметров питомцев
//        assertEquals(expectedRevenue, hotel.calcRevenue(), "Выручка рассчитана неверно");
//    }
//
//    @Test
//    void findPetsByType() {
//        // Проверим, что метод правильно возвращает питомцев по типу
//        Pet[] expectedDogs = {pets[0], pets[1]};
//        assertArrayEquals(expectedDogs, hotel.findPetsByType("Собака"), "Неправильный список собак");
//
//        Pet[] expectedCats = {pets[2]};
//        assertArrayEquals(expectedCats, hotel.findPetsByType("Кошка"), "Неправильный список кошек");
//    }
//}