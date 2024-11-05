package homework_39.currency;
//Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.

enum Currency {
    USD(1.1),     // Курс доллара к евро
    GBP(0.85),    // Курс фунта к евро
    JPY(130.2),   // Курс иены к евро
    CHF(1.05),    // Курс швейцарского франка к евро
    AUD(1.6);     // Курс австралийского доллара к евро

    private final double rateToEuro;

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double convertToEuro(double amount) {
        return amount / rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }
}