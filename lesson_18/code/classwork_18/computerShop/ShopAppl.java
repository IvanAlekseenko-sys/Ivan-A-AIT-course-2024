package classwork_18.computerShop;

import classwork_18.computerShop.model.Computer;

//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе? Какова общая стоимость всех устройств на складе?
//В методе main добавить объект Smartphone, и распечатать его в консоль.
public class ShopAppl {
    public static void main(String[] args) {
//        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
//        //System.out.println(computer);
//
//        Laptop laptop = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 14, 1.5, 10, "Blue");
//        //System.out.println(laptop);
//
//
//        Computer[] computers = new Computer[5];
//        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
//        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
//        computers[2] = new Computer("AMD Ryzen", 8, 256, "NoName", 2000);
//        computers[3] = new Laptop("M2", 8, 256, "MacBook", 2500, 14, 1.5, 10, "white");
//        computers[4] = new Laptop("i3", 8, 512, "NoName", 2000, 16, 1.5, 10, "white");
//
//        int totalStorage = 0;
//        for (int i = 0; i < computers.length; i++) {
//            totalStorage += computers[i].getStorage();
//
//        }
//        System.out.println("Total storage: " + totalStorage);
//
//        double totalPrice = 0;
//        for (int i = 0; i < computers.length; i++) {
//            totalPrice += computers[i].getPrice();
//
//        }
//        System.out.println("Total price: " + totalPrice);
//        System.out.println("----------------------------");
//
//        for (int i = 0; i < computers.length; i++) {
//            System.out.println(computers[i]);
//        }
//            for (int i = 0; i < computers.length; i++) {
//                System.out.println(computers[i].getBrand());
//
//            }
        Smartphone smartphone = new Smartphone("A18 Pro", 8, 1024, "iPhone", 1829, 6.3, 0.199, 18, "Natural Titanium", 356303482155262L);
        System.out.println(smartphone);

    }//end of main

}//end of class
