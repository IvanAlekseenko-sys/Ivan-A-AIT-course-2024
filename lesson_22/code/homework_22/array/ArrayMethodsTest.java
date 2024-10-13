package homework_22.array;

import homework_22.array.model.ArrayMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    private ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods(new int[]{1, 15, 6, 22, 33, 48, 33});
    }

      //тест на сумму элементов с нечетными индексами
    @Test
    void testSumOfOddIndexElements() {
        int expectedSum = 15 + 22 + 48; // ожидания суммы элементов с нечетными индексами
        assertEquals(expectedSum, arrayMethods.sumOfOddIndexElements());
    }

    // тест на поиск 5 элемента
    @Test
    void findFifthElementInArray(){
        int expectedElement = 33;
        assertEquals(expectedElement, arrayMethods.findFifthElementInArray());
    }

}