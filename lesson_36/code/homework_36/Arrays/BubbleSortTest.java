package homework_36.Arrays;


public class BubbleSortTest {
    public static void main(String[] args) {

        int[] newArray = ArrayMethods.fillArray(0, 1000, 10);
        ArrayMethods.bubbleSort(newArray);
        newArray = ArrayMethods.fillArray(0, 1000, 100);
        ArrayMethods.bubbleSort(newArray);
        newArray = ArrayMethods.fillArray(0, 1000, 1000);
        ArrayMethods.bubbleSort(newArray);

    }
}


