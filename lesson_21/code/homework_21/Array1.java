package homework_21;

import java.util.Arrays;

public class Array1 {
    private int[] newArray;


    //constructor
    public Array1(int[] array) {
        this.newArray = array;
    }

    //getters setters
    public int[] getNewArray() {
        return newArray;
    }

    public void setNewArray(int[] newArray) {
        this.newArray = newArray;
    }

    //find max value method
    public int findMaximal() {
        int maxArray = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > maxArray) {
                maxArray = newArray[i];
            }
        }
        return maxArray;
    }

    //find max index method
    public int findMaxIndex() {
        int maxArray = newArray[0];
        int indexOfMaxElement = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > maxArray) {
                maxArray = newArray[i];
                indexOfMaxElement = i;
            }
        }
        return indexOfMaxElement;
    }

    //find min value method
    public int findMin() {
        int minArray = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < minArray) {
                minArray = newArray[i];
            }
        }
        return minArray;
    }

    //find min index method
    public int findMinIndex() {
        int minArray = newArray[0];
        int indexOfMinElement = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < minArray) {
                minArray = newArray[i];
                indexOfMinElement = i;
            }
        }
        return indexOfMinElement;
    }

    @Override
    public String toString() {
        return "Array1{" +
                "newArray=" + Arrays.toString(newArray) +
                '}';
    }



}





