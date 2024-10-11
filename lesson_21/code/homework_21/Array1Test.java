package homework_21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {


    private Array1 array1;

    @BeforeEach
    void setUp() {
        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};
        array1 = new Array1(array);  // Свежий объект перед каждым тестом
    }

    @Test
    void findMaximal() {
        assertEquals(83, array1.findMaximal(), "Тест на поиск максимального значения не пройден");
    }

    @Test
    void findMaxIndex() {
        assertEquals(9, array1.findMaxIndex(), "Тест на поиск индекса максимального значения не пройден");
    }

    @Test
    void findMin() {
        assertEquals(-55, array1.findMin(), "Тест на поиск минимального значения не пройден");
    }

    @Test
    void findMinIndex() {
        assertEquals(8, array1.findMinIndex(), "Тест на поиск индекса минимального значения не пройден");
    }
}
