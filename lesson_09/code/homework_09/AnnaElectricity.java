package homework_09;
//Анна использует различные электроприборы в своем доме.
//У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
//Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
//Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
//Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)
public class AnnaElectricity {

    public static void main(String[] args) {
        int fridgePower = 150; // мощность холодильника в ваттах
        int acPower = 2000;    // мощность кондиционера в ваттах
        double costPerKWh = 0.15; // стоимость 1 кВт·ч в евро
        int daysInMonth = 30;  // Количество дней в месяце

        // Вызов метода расчет потребления за 1 час
        double hourlyConsumption = calculateHourlyConsumption(fridgePower, acPower);
        System.out.println("Энергопотребление холодильника и кондиционера за 1 час: " + hourlyConsumption + " кВт·ч");

        // Вызов метода расчет месячных расходов
        double monthlyCost = calculateMonthlyCost(hourlyConsumption, costPerKWh, daysInMonth);
        System.out.println("Затраты Анны на электроэнергию за месяц: " + monthlyCost + " евро");
    }//end of main

    // Метод для расчета энергопотребления за 1 час
    public static double calculateHourlyConsumption(int fridgePower, int acPower) {
        // Перевод мощности холодильника и кондиционера из ватт в кВт, суммируем результат
        return (fridgePower + acPower) / 1000.0;
    }

    // Метод для расчета месячных затрат
    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKWh, int daysInMonth) {
        int hoursPerDay = 24; // техника работает круглосуточно
        // Общие месячные затраты: потребление за 1 час * количество часов в день * дни в месяце * стоимость 1 кВт·ч
        return hourlyConsumption * hoursPerDay * daysInMonth * costPerKWh;
    }

}//end of class