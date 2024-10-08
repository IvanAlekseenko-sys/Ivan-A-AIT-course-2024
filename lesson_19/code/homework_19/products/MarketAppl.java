package homework_19.products;
//Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.
//В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.

import homework_19.products.model.Product;

import java.util.Scanner;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product(5, "USB Cable", 241456L);
        products[1] = new Food(9.99, "Fish", 241456L, "10/12/2024");
        products[2] = new MeatFood(7, "Steak", 435245L, "12/12/2024", "beef");
        products[3] = new MilkFood(0.99, "Milky Milk", 634634L, "15/12/2024", "Cow's milk", 3.5);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
        }
        System.out.println("Total price for all products: " + totalPrice);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Barcode of the product: ");
        long barcode = scanner.nextInt();

        Product foundProduct = Product.findProductByBarcode(products, barcode);
        // Вывод результата
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product with barcode " + barcode + " not found.");
        }
    }//end of main


}//end of class
