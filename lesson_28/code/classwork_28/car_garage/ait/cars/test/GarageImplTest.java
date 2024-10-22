package classwork_28.car_garage.ait.cars.test;

import classwork_28.car_garage.ait.cars.dao.Garage;
import classwork_28.car_garage.ait.cars.dao.GarageImpl;
import classwork_28.car_garage.ait.cars.car_sorting.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    private Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model5", "Company1", 1.5, "Red", 20000, 2022);
        cars[1] = new Car("Number2", "Model1", "Company2", 2.5, "Green", 22000, 2023);
        cars[2] = new Car("Number3", "Model2", "Company3", 1.7, "Red", 18000, 2018);
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green", 19500, 2018);

        //add cars to garage  добавить все в гараж
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }


    @Test
    void addCarTest() {


    }

    @Test
    void removeCarTest() {

    }


    @Test
    void findCarsByRegNumberTest() {
        Car[] expected = {cars[0]};
        Car[] actual = garage.findCarsByRegNumber("Number1");
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[1]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[1], cars[3]}; // Убедитесь, что это корректные автомобили
        Car[] actual = garage.findCarsByCompany("Company2");
        assertArrayEquals(expected, actual);


    }

    @Test
    void findCarsByEngineTest() {
        Car[] expected = {cars[0]};
        Car[] actual = garage.findCarsByEngine(1.4, 1.6);
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByColor("Red");
        assertArrayEquals(expected, actual);

    }

    @Test
    void sizeTest() {
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest() {
        garage.printCars();
    }

}//end of class