package classwork_18.computerShop;

import classwork_18.computerShop.model.Computer;

//Найти вес всех мобильных устройств
//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе? Какова общая стоимость всех устройств на складе?
//В методе main добавить объект Smartphone, и распечатать его в консоль.
public class ShopAppl {
    public static void main(String[] args) {
        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        //System.out.println(computer);

        Laptop laptop = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 14, 1.5, 10, "Blue");
        //System.out.println(laptop);


        Computer[] computers = new Computer[6]; // тип - Computer (super родительский класс)
        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD Ryzen", 8, 256, "NoName", 2000);
        computers[3] = new Laptop("M2", 8, 256, "MacBook", 2500, 14, 1.5, 10, "white"); //down casting
        computers[4] = new Laptop("i3", 8, 512, "NoName", 2000, 16, 2.5, 10, "white"); // down casting
        computers[5] = new Smartphone("A1", 8, 256, "Samsung", 1300, 9, 0.450, 12, "pink",123L); //down casting

        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop){
                Laptop myLaptop = (Laptop) computers[i]; //upper casting
                totalWeight += myLaptop.getWeight();

            }
        }
        System.out.println("Total weight: " + totalWeight);
        System.out.println("---------------------------------");
        int totalStorage = 0;
        for (int i = 0; i < computers.length; i++) {
            totalStorage += computers[i].getStorage();

        }
        System.out.println("Total storage: " + totalStorage);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }
        System.out.println("Total price: " + totalPrice);
        System.out.println("----------------------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }
            for (int i = 0; i < computers.length; i++) {
                System.out.println(computers[i].getBrand());

            }
        Smartphone smartphone = new Smartphone("A18 Pro", 8, 1024, "iPhone", 1829, 6.3, 0.199, 18, "Natural Titanium", 356303482155262L);
        System.out.println(smartphone);

    }//end of main

}//end of class
