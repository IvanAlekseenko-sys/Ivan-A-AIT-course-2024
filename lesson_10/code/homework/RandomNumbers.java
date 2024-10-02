package homework;
//Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30. Выведите массив на печать.
//Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
public class RandomNumbers {
    public static void main(String[] args) {
        int [] randomNumbers = {12,15,14,11,23,25,10,18,16,21,27,16,17,28,20,15,19,25,24,22};
        System.out.println("Direct order: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");

        }
        System.out.println();
        System.out.println("Reverse order: ");
        for (int i = randomNumbers.length -1; i >= 0 ; i--) {
            System.out.print(randomNumbers[i] + " ");

        }

    }//end of main

}//end of class
