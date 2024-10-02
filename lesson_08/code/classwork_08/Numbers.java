package classwork_08;

//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers {

    public static void main(String[] args) {
        int count = 1; // параметр цикла
        int finalNumber = 100; //последняя переменная

        while (count <= finalNumber) {
            if (count % 5 == 0)//если остаток 0, будет печатать
                 {
                System.out.print(count + " ");
            }

            count++;//постфиксная операция увеличивает переменную на 1

        }

    }//end of main


}//end of class
