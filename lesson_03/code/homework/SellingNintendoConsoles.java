package homework;

//Задача продать Нинтендо Свич за 200 евро, при этом нужно поторговаться.

public class SellingNintendoConsoles {
    public static void main(String[] args) {
        System.out.println("Продаю свою Нинтендо Свич за 220 евро, есть желающие купить?");
        NintendoSwitchBuyer();
        System.out.println("Продано!");
    }

    public static void NintendoSwitchBuyer() {
        System.out.println("Готов купить за 200 евро");
        MyThoughts();

    }

    public static void MyThoughts() {
        double x = 220;
        double y = 200;
        System.out.println(" Мои мысли на данное предложение : Сколько я потеряю? Очевидно, что " + (x - y) + " евро");

    }

}//end of class
