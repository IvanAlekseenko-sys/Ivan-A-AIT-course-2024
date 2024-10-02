package methods;

public class MethodsCalls2 {

    public static void main(String[] args) {
        method1();
    } // end of main

    public static void method1() {
        System.out.println("method1 стартовал");
        method2();
        System.out.println("method3 финишировал");
    } // end of method1

    public static void method2() {
        System.out.println("method2 стартовал");
        method3();
        System.out.println("method2 финишировал");
    } // end of method2

    public static void method3() {
        System.out.println("method3 стартовал");
        // Дополнительные действия могут быть выполнены здесь
        System.out.println("method1 финишировал");
    } // end of method3

} // end of class