package homework_22.random_array;

import homework_22.random_array.model.RandomArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomArrayTest {

        RandomArray randomArray;

        @BeforeEach
        void setUp() {
            randomArray = new RandomArray();
        }

        @Test
        void testCountPositiveNumbers() {
            int count = randomArray.countPositiveNumbers();
            assertTrue(count >= 0 && count <= 100, "Количество положительных чисел должно быть в диапазоне от 0 до 100");
        }

        @Test
        void testCountNegativeNumbers() {
            int count = randomArray.countNegativeNumbers();
            assertTrue(count >= 0 && count <= 100, "Количество отрицательных чисел должно быть в диапазоне от 0 до 100");
        }

        @Test
        void testCountEvenNumbers() {
            int count = randomArray.countEvenNumbers();
            assertTrue(count >= 0 && count <= 100, "Количество четных чисел должно быть в диапазоне от 0 до 100");
        }

        @Test
        void testCountZeros() {
            int count = randomArray.countZeros();
            assertTrue(count >= 0 && count <= 100, "Количество  нулей должно быть в диапазоне от 0 до 100");
        }
    }