package classwork;
//Создайте массив и заполните его целыми числами от 1 до 20.
public class Task1 {
    public static void main(String[] args) {
            int[] numbers = new int[20]; // length of array = 20 , indexes from 0-19

        //numbers [0] - 1st element of array
        //numbers.length = 20
        //numbers [numbers.length-1] - last element of array

        //fill in array numbers
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
            System.out.print(numbers [i] + " ");
        }
        //print array numbers
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers [i] + " ");

 //       }
//        System.out.println();
//        System.out.println(numbers);
    }//end 0f main
}//end of class
