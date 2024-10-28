package classwork_33.coffee_machine;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to our Coffee Shop!");
        boolean flag = true;
        Coffee[] coffees = Coffee.values();
        Scanner scanner = new Scanner(System.in);
        //start of loop
        while (flag) {
            System.out.println("Make your selection:Press 1 for Espresso, 2 for Americano,3 for Cappuccino,4 for Latte, 5 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1,2,3,4 -> {
                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
                    System.out.println("Please make payment: " + coffees[choice - 1].getPrice());
                }
                case 5 -> flag = false;
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
