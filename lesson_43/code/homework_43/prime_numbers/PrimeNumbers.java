package homework_43.prime_numbers;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("Список чисел: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("-------------------------------------");
        // Отбираем только простые числа
        List<Integer> primes = numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .toList();

        // Выводим результат
        System.out.println("Из них простые числа: " + primes);
    }

    // Метод для проверки простое число или нет
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Числа <= 1 не простые
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Если делится на i, то число не простое
            }
        }
        return true;
    }
}
