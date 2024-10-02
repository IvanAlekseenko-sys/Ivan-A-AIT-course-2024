package classwork_13.array_methods;


public class ArrayMethodsAppl_old {
    public static void main(String[] args) {

        int[] myArray = {10,20,30,40,50};
        System.out.println(ArrayMethods_old.linearSearch(myArray, 10));
        System.out.println(ArrayMethods_old.linearSearch(myArray, 100));
        System.out.println("____________________________________________");
        int index = ArrayMethods_old.binarySearch(myArray, 20);
        System.out.println(index);

    }
//        int [] myTestArray = ArrayMethods.fillArray(100, 5000, 35);
//        // print of array
//        System.out.println("Array: ");
//        ArrayMethods.printArray(myTestArray);
//
//        double percent = 5;
//        double[] interest = ArrayMethods.calculatePercent(myTestArray, percent);
//        // Print with percentage
//        System.out.println("Array with percentages: ");
//        ArrayMethods.printArrayDouble(interest);
//
//        // Sum of array
//        int sum = ArrayMethods.sumArray(myTestArray);
//        System.out.println("Sum of array: " + sum);
//
//        // Calculate average of array
//        double average = ArrayMethods.averageValue(interest);
//        System.out.println("Average of an array with percentages: " + average);
//    }
}

//-----------------------------------------------------------------------------------------
//    int[] myArray = ArrayMethods.fillArray(-10, 20, 30);
//    ArrayMethods.printArray(myArray);
//
//    Scanner scanner = new Scanner (System.in);
//
//        System.out.println("Input number for searching ");
//        int n = scanner.nextInt();
//
//        boolean isArray = ArrayMethods.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isArray);