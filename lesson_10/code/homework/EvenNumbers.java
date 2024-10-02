package homework;
//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
//Распечатать массив в порядке возрастания, затем в порядке убывания.

public class EvenNumbers {
    public static void main(String[] args) {
        int[] evenNumbers = new int[26]; // делаем массив на 26 значений, так как нам нужны только четные числа до 50
        System.out.println("В порядке возрастания: ");
        for (int i = 1; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2; // умножаем на 2, чтобы получить только четные числа
            System.out.print(evenNumbers[i] + " ");

        }

        System.out.println();
        System.out.println("В порядке убывания: ");
        for (int i = evenNumbers.length - 1; i >= 1; i--) {  //evenNumbers.length - 1 Означает, что массив начнется с 25 позиции
            System.out.print(evenNumbers[i] + " ");
        }
    }// end of main

}// end of class
