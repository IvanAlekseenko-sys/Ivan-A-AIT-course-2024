package classwork_28.car_garage.ait.cars.car_sorting.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car[] cars;


    @BeforeEach
    void setUp() {
        cars = new Car[5];
        cars[0] = new Car("AR2D", "BMW", "C1 GmbH", 2.4, "black", 25000, 2021);
        cars[1] = new Car("BXT4", "Audi", "D2 Motors", 3.0, "white", 30000, 2022);
        cars[2] = new Car("CZY8", "Mercedes", "E3 Group", 2.2, "silver", 28000, 2021);
        cars[3] = new Car("DWT9", "Tesla", "F4 Electric", 4.0, "blue", 50000, 2023);
        cars[4] = new Car("EGL7", "Toyota", "G5 Auto", 1.8, "red", 18000, 2019);
    }


    //печатаем массив авто
    @Test
    void printCars() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
    }

    //сортируем по модели
    @Test
    void sortCarsByModelTest() {
        System.out.println("List of cars as is: ");
        printCars();
        Arrays.sort(cars);
        System.out.println("List of sorted cars by model: ");
        printCars();

    }

    //сортируем по году производства
    @Test
    void sortCarsByProductionYear(){
        Comparator<Car> comparatorByProductionYear = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getProductionYear() - c2.getProductionYear();
            }
        };
        System.out.println("List of cars as is: ");
        printCars();
        Arrays.sort(cars, comparatorByProductionYear); // sorting by year of production
        System.out.println("List of sorted cars by production year: ");
        printCars();


    }

    @Test
    void sortCarsByPriceTest() {
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getPrice(), c2.getPrice());
            }
        };
        System.out.println("List of cars as is: ");
        printCars();
        Arrays.sort(cars, comparatorByPrice); // sorting by title
        System.out.println("List of sorted cars by price: ");
        printCars();

    }


    //сортируем по цвету
    @Test
    void sortCarsByColorTest() {
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getColor().compareTo(c2.getColor());
            }
        };
        System.out.println("List of cars as is: ");
        printCars();
        Arrays.sort(cars, comparatorByColor); // sorting by title
        System.out.println("List of sorted cars by color: ");
        printCars();


    }
}//end of class