package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTddTest {

    ArrayTdd arrayTdd;
    int[] array = {10, -10, 20, -15, 45}; // 3 positive numbers

    @BeforeEach
    void setUp() {
        arrayTdd = new ArrayTdd(array);
    }

    @Test
    void countPositive() {
        //expected
        int expected = 3;
        //actual
        int actual = arrayTdd.countPositive(array);
        //assert
           assertEquals(expected, actual, "ok");
    }
}