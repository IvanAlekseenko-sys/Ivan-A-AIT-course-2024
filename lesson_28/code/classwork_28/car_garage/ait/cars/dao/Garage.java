package classwork_28.car_garage.ait.cars.dao;

import classwork_28.car_garage.ait.cars.car_sorting.model.Car;

public interface Garage {
    boolean addCar(Car car);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Car[] findCarsByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);

    Car[] findCarsByRegNumber(String regNumber);


    int size();

    void printCars();


}//end of class
