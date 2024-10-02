package methods;

public class MethodsTest {

    public static void main(String[] args) {

        method1();
        method2();
        method3();

    }// end of main

    public static void method1(){
        System.out.println("method1 стартовал");
        System.out.println("method1 вызывает method2");
        System.out.println("method1 финишировал");
    }
    public static void method2() {
        System.out.println("method2 стартовал");
        System.out.println("method2 вызывает method3");
        System.out.println("method2 финишировал");
    }
    public static void method3 () {
        System.out.println("method3 стартовал");
        System.out.println("method3 финишировал");
    }

}// end of class
