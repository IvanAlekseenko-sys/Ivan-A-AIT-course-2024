package classwork_11;
//Задача о "вкраплениях".
//Имеется массив целых чисел, в котором несколько раз встречается число X.
//Выясните, сколько раз это число встречается в массиве? На каких местах массива оно стоит?
public class Task2 {
    public static void main(String[] args) {
        int[] array = {-145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int[] arrayOfIndex = new int[array.length]; //guess

        int x = -145;
        int j = 0; // индекс для массива индексов

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x){
                count ++;
                System.out.print(i+ " ");
                arrayOfIndex [j] = i; //заносим индекс во второй массив
                j++;// увеличиваем индекс 2-го массива
            }

        }
        System.out.println();
        System.out.println(count);

        //печатаем массив индексов
        for (int k = 0; k < j; k++) {
            System.out.print(arrayOfIndex[k] + " ");

        }
    }//end of main


}//end of class
