package homework_44.computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComputerAppl {
    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("Apple", "M1", 16, 512, 1200.0, "macOS"));
        computerList.add(new Computer("Dell", "Intel i7", 8, 256, 800.0, "Windows"));
        computerList.add(new Computer("HP", "AMD Ryzen 5", 16, 1024, 1100.0, "Windows"));
        computerList.add(new Computer("Lenovo", "Intel i5", 8, 512, 750.0, "Windows"));
        computerList.add(new Computer("Asus", "Intel i9", 32, 2048, 2500.0, "Windows"));
        computerList.add(new Computer("Microsoft", "ARM", 16, 512, 1500.0, "Windows"));

        // отобразить все компьютеры
        System.out.println("-------------Computer list------------");
        computerList.forEach(System.out::println);

        // отобразить компьютеры с заданным объемом ОЗУ
        System.out.println("------Print computers with 16GB RAM-------");
        computerList.stream()
                .filter(computer -> computer.getRam() == 16)
                .forEach(System.out::println);

        // отобразить компьютеры, стоимость которых больше указанной цены
        System.out.println("-------------Computers that cost more than 1000: ------------");
        computerList.stream()
                .filter(computer -> computer.getPrice() > 1000.0)
                .forEach(System.out::println);

        // отобразить компьютеры, год выпуска которых в заданном диапазоне
        System.out.println("-------------Computers with RAM between 8GB and 16GB ------------");
        computerList.stream()
                .filter(computer -> computer.getRam() >= 8 && computer.getRam() <= 16)
                .forEach(System.out::println);

        System.out.println("-------------Computers sorted by price from expensive to cheap ones ------------");

        // отсортировать компьютеры по цене от самой дорогой до самой дешевой
        computerList.stream()
                .sorted(Comparator.comparingDouble(Computer::getPrice).reversed())
                .forEach(System.out::println);

        // получить среднюю стоимость компьютера
        double averagePrice = computerList.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0.0);

        System.out.println("---------------------------------");
        System.out.println("Average price of all computers: " + averagePrice);

        System.out.println("---------------Computers with indication of OS and quantity----------------------");
        // сколько и какие компьютеры работают под каждой операционной системой
        Map<String, List<Computer>> computersByOS = computerList.stream()
                .collect(Collectors.groupingBy(Computer::getOperatingSystem));

        computersByOS.forEach((os, computers) -> {
            System.out.println("Operating System: " + os);
            System.out.println("Computers quantity: " + computers.size());
            computers.forEach(System.out::println);
        });
    }
}
