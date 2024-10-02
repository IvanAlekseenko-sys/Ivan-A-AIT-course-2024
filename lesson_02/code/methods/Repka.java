package methods;

public class Repka {
    public static void main(String[] args) {
        System.out.println("Посадил дед репку. Выросла репка большая-пребольшая. Пошел дед репку рвать:");
        Grandpa();
        System.out.println("Вот и сказке конец, а кто слушал - молодец!");
    } //end of main

    public static void Grandpa() {
        System.out.println("Тянет потянет, вытянуть не может, позвал дед бабку");
        Grandma();
    }

    public static void Grandma() {
        System.out.println("Бабка за дедку - тянут потянут, вытянуть не могут, позвала бабка внучку");
        Granddaughter();
    }

    public static void Granddaughter() {
        System.out.println("Бабка за дедку, внучка за бабку - тянут потянут, вытянуть не могут, позвала внучка Жучку");
        Zhuchka();
    }

    public static void Zhuchka() {
        System.out.println("Бабка за дедку, внучка за бабку, Жучка за внучку - тянут потянут, вытянуть не могут, позвала внучка кошку");
        Cat();
    }
    public static void Cat(){
        System.out.println("Бабка за дедку, внучка за бабку, Жучка за внучку, кошка за Жучку - тянут потянут, вытянуть не могут, позвала кошка мышку");
        Mouse();
    }
    public static void Mouse(){
        System.out.println("Бабка за дедку, внучка за бабку, Жучка за внучку, кошка за Жучку, мышка за кошку - тянут потянут - вытянули репку!");
    }

} //end of class
