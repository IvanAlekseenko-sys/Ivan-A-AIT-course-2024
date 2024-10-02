package methods;

public class MethodCalls {

    public static void main(String[] args) {
        method1();
    } //end of main

    public static void method1() {
        System.out.println("method1 стартовал");
        method2();
        System.out.println("method3 финишировал");
    }

    public static void method2() {
        System.out.println("method2 стартовал");
        method3();
        System.out.println("method2 финишировал");
    }

    public static void method3() {
        System.out.println("method3 стартовал");
        System.out.println("method1 финишировал");
    }

    } //end of class