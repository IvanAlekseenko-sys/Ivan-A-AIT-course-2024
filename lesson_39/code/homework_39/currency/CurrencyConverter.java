package homework_39.currency;

import java.util.HashSet;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> currencyCodes = new HashSet<>();

        // Добавление валют в HashSet и вывод курсов (проверка на дублирующиеся коды валют при добавлении, но для enum избыточна, так как enum сам по себе обеспечивает отсутствие дублирующихся элементов)
        System.out.println("Доступные валюты и их курсы к евро:");
        for (Currency currency : Currency.values()) {
            if (currencyCodes.add(currency.name())) { // добавляем код в HashSet, если его еще нет
                System.out.println(currency + ": " + currency.getRateToEuro());
            } else {
                System.out.println("Валюта с кодом " + currency + " уже существует!");
            }
        }

        // Запрос кода валюты у пользователя
        System.out.print("Введите код валюты: ");
        String currencyCode = scanner.nextLine().toUpperCase();

        // Проверка, существует ли уже валюта
        if (currencyCodes.contains(currencyCode)) {
            Currency selectedCurrency = Currency.valueOf(currencyCode);

            // Ввод количества валюты
            System.out.print("Введите количество валюты для обмена: ");
            double amount = scanner.nextDouble();

            // Конвертация и вывод результата
            double euros = selectedCurrency.convertToEuro(amount);
            System.out.println(amount + " " + selectedCurrency + " = " + euros + " EUR");
        } else {
            System.out.println("Введен неверный код валюты.");
        }

    }
}