package homework_11;
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
//Найдите максимальный элемент массива и его индекс.
//Поставьте этот элемент в начало массива вместо имеющегося.

public class AnotherArray {
    public static void main(String[] args) {
        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};
        int maxArray = array[0];
        int indexOfMaxElement = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
                indexOfMaxElement = i;

            }


        }
        System.out.println("Max element of array = " + maxArray);
        System.out.println("Index of max element of array = " + indexOfMaxElement);

        int temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[0];
        array[0] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


    }//end of main


}//end of class
