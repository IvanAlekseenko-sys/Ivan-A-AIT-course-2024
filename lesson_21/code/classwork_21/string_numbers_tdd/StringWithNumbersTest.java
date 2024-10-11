package classwork_21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; // object for test

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10"); // 454 ожидаем, что данное значение метод вернет


    }

    @Test
    void sumOfNumbersInStringTest() {
        String str = "1 2 1";
        int expected = 4;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);

    }

}