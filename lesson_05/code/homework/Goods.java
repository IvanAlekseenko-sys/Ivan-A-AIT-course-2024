package homework;

//Сделайте расчет покупки товаров со скидками. Товар А стоит X (15) евро и на него скидка D%(7%), а товар B стоит Y(20) евро и на него скидка С%(10%).
//Клиент взял N(4) товаров A и M(3) товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
//Вычислите итоговую стоимость покупки и величину полученной скидки.
public class Goods {
    public static void main(String[] args) {
        double A = 15; //цена товара A
        double B = 20; // цена товара B

        double discountA = 0.07; //скидка 7% для товара А
        double discountB = 0.10; //скидка 10% для товара B

        double finalPriceA = finalPriceA(A, discountA);
        double finalPriceB = finalPriceB(B, discountB);

        System.out.println("Стоимость продукта А за 1 единицу с учетом скидки: " + finalPriceA);
        System.out.println("Стоимость продукта B за 1 единицу с учетом скидки: " + finalPriceB);

        int quantityA = 4; //количество купленных товаров А
        int quantityB = 3; //количество купленных товаров B

        double totalCost = (finalPriceA * quantityA) + (finalPriceB * quantityB);

        System.out.println("Общая стоимость товаров = " + totalCost);

        totalCost = applyAdditionalDiscount(totalCost);

        System.out.println("Финальная стоимость после применения дополнительной 5% скидки (если она возможна) : " + totalCost);


    }//end of main

    public static double finalPriceA(double A, double discountA) {
        double finalPriceA = A * (1 - discountA);
        return finalPriceA; //возврат цены за 1 единицу товара со скидкой
    }

    public static double finalPriceB(double B, double discountB) {
        double finalPriceB = B * (1 - discountB);
        return finalPriceB; //возврат цены за 1 единицу товара со скидкой


    }

    public static double applyAdditionalDiscount(double totalCost) {
        double additionalDiscount = 0.05; // дополнительная скидка 5%
        boolean applyDiscount = totalCost > 100; // стоимость покупки, если дополнительная скидка должна быть применена

        if (applyDiscount) {
            totalCost = totalCost * (1 - additionalDiscount); // применяем дополнительную скидку
        } else {
            System.out.println("Дополнительная скидка не применяется, так как сумма покупки меньше 100 Евро");
        }

        return totalCost;
    }

}// end of class


