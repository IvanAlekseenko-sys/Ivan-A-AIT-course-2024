package homework_08;

//Распечатайте все натуральные числа меньшие 200 и кратные 13.
//Используйте циклы while и do while.
public class NaturalNumbers {
    public static void main(String[] args) {

        int x = 200;
        int div = 13;
        while (x > 0) {
            if (x % div == 0) {
                System.out.println(x);
            }
            x--;
        }
    }//end of main

}//end of class
