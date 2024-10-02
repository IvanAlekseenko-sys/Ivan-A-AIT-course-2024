package homework;

//Найти произведение всех двузначных нечетных чисел кратных 17.
public class TwoDigitOddNumbers {
    public static void main(String[] args) {
        int multiplication = 1;
        System.out.println("Two-Digit odd numbers from 0-100 multiplies of 17: ");
        for (int i = 17; i < 100; i = i + 17) {
            if (i % 2 != 0) {
                System.out.println(i);
                multiplication = multiplication * i;
            }
        }
        System.out.println("Final result of multiplication: " + multiplication);

    }//end of main
}//end of class
