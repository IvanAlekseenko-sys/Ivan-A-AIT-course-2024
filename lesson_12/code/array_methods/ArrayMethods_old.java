package array_methods;

// - заполнение массива случайными целыми числами из интервала от a до b +
// - печать массива целых чисел +
// - поиск элемента
// - calculatePercent
// - printArrayDouble()
// - sumArray
// - averageArray
public class ArrayMethods_old {


    //-------------------------fill array with random numbers-------------------------------------
// a- left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return result;
    }

    //-------------------------------------print array----------------------------------------
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("______________________________________");
    }


    //------------------------------------search in array-----------------------------------------
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;

            }//end of if

        }//end of for

        return false;
    }//end of searchInArray

    //----------------------------------calculate percent------------------------------------
    public static double[] calculatePercent(int[] array, double percent) {
        double[] updatedBalances = new double[array.length]; // Массив для хранения новых значений с процентами
        for (int i = 0; i < array.length; i++) {
            updatedBalances[i] = array[i] + (array[i] * percent / 100); // Начисляем проценты
        }
        return updatedBalances;
    }


    //-----------------------------print array double----------------------------------------
    public static void printArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("______________________________________");
    }

    //---------------------------SumArray-----------------------------------------------------
    public static int sumArray(int[] array) {
        int sum = 0; // Переменная для хранения суммы элементов массива
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // Суммируем все элементы
        }
        return sum; // Возвращаем сумму
    }

    //--------------------------------AverageArray------------------------------------------
    public static double averageValue(double[] array) {
        double sum = 0;  // Переменная для хранения суммы элементов массива

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];  // Суммируем все элементы
        }

        return sum / array.length;  // Возвращаем среднее арифметическое
    }

    //-------------------------linear search---------------------------------------------
    //linear search, return index (if element absent return -1)

    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i; // go out from method
            }

        }
        return -1;
    }


}//end of class




