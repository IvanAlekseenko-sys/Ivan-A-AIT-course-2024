package homework_23.Trip;

import homework_23.Trip.model.Cars;

//Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?
public class CarsAppl {

    public static void main(String[] args) {
         //создаем массив и заполняем его
        Cars[] carsArray = new Cars[5];
        carsArray[0] = new Cars("Audi","d",1.6,6.6,45);
        carsArray[1] = new Cars("BMW","b",1.8,6.8,49);
        carsArray [2] = new Cars("Opel","d",1.6,6.9,45);
        carsArray [3] = new Cars("VW","d",1.6,6.5,39);
        carsArray [4] = new Cars("Mercedes","b",1.8,6.3,49);

        // Переменные для хранения информации о минимальной стоимости поездки и авто
        double minTotalCost = Double.MAX_VALUE; // Устанавливаем начальное значение минимальной стоимости поездки
        Cars bestCar = null; // Автомобиль с минимальной стоимостью

        // Перебираем массив и считаем стоимость поездки для каждого автомобиля
        for (Cars car : carsArray) {
            double fuelCost = car.calculateFuelCost();
            int rentCost = car.getRentPrice();
            double totalCost = fuelCost + rentCost; // Общая стоимость поездки

            // Проверяем - текущая стоимость меньше минимальной? и обновляем при необходимости
            if (totalCost < minTotalCost) {
                minTotalCost = totalCost;
                bestCar = car;
            }
        }

        // вывод информации о самом выгодном авто
        System.out.println("Самый выгодный автомобиль: " + bestCar.getBrand());
        System.out.println("Общая стоимость поездки: " + minTotalCost);
    }
}






