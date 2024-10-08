package classwork_19.compare_computers;
//Задание 2. Сравнение двух объектов типа Computer. Использование метода equals для сравнения объектов.


import java.util.Scanner;

public class CompareComputers {

    public static void main(String[] args) {

        Computer c1 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println(c1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input CPU: ");
        String cpu = scanner.nextLine();
        System.out.println("Input RAM: ");
        int ram = scanner.nextInt();
        System.out.println("Input Storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input price: ");
        double price = scanner.nextDouble();

        //scanner.nextLine();
        Computer c2 = new Computer(cpu, ram, storage, brand, price);
        System.out.println(c2);

        boolean checker = (c1 == c2);
        System.out.println(checker); // false because links are not equal

        checker = c1.equals(c2);
        System.out.println(checker);// String сравнивается только через equals! Объекты также сравниваются только через equals


    }//end of main

}//end of class
