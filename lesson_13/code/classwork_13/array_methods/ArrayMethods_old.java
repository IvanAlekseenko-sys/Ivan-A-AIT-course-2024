package classwork_13.array_methods;

// - заполнение массива случайными целыми числами из интервала от a до b +
// - печать массива целых чисел +
// - поиск элемента
// - calculatePercent
// - printArrayDouble()
// - sumArray
// - averageArray
public class ArrayMethods_old {


    //-------------------------Fill array with random numbers-------------------------------------
// a- left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return result;
    }

    //-------------------------------------Print array----------------------------------------
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("______________________________________");
    }


    //------------------------------------Search in array-----------------------------------------
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;

            }//end of if

        }//end of for

        return false;
    }//end of searchInArray

    //----------------------------------Calculate percent------------------------------------
    public static double[] calculatePercent(double[] array, double percent) {
        double[] updatedBalances = new double[array.length]; // Массив для хранения новых значений с процентами
        for (int i = 0; i < array.length; i++) {
            updatedBalances[i] = array[i] + (array[i] * percent / 100); // Начисляем проценты
        }
        return updatedBalances;
    }


    //-----------------------------Print array double----------------------------------------
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

    //-------------------------linearSearch---------------------------------------------

    //O(n) - чем больше элементов массива, тем дольше работает метод
    //linear search, return index (if element absent return -1)

    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i; // go out from method
            }

        }
        return -1;
    }

    //--------------------------BinarySearch----------------------
    //O(log(n))
    //binary search
    public static int binarySearch(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n) {
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; //правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1;   //левую половину надо отбросить
            }
        }
        return -leftIndex - 1; //если не нашлось
    }

}//end of class




