package array_methods;


public class ArrayMethodsAppl_old {
    public static void main(String[] args) {
        int [] myTestArray = ArrayMethods_old.fillArray(100, 5000, 35);
        // print of array
        System.out.println("Array: ");
        ArrayMethods_old.printArray(myTestArray);

        double percent = 5;
        double[] interest = ArrayMethods_old.calculatePercent(myTestArray, percent);
        // Print with percentage
        System.out.println("Array with percentages: ");
        ArrayMethods_old.printArrayDouble(interest);

        // Sum of array
        int sum = ArrayMethods_old.sumArray(myTestArray);
        System.out.println("Sum of array: " + sum);

        // Calculate average of array
        double average = ArrayMethods_old.averageValue(interest);
        System.out.println("Average of an array with percentages: " + average);
    }
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