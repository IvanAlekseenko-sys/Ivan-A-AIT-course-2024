package classwork_05;

//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".
public class ConditionsEx {
    public static void main(String[] args) {
        //неполный условный оператор
        int x = 158;
        if (x >= 0) {
            System.out.println("x = " + x + " is a positive number");


        }//end of if

        if (x < 0) {

            System.out.println("x = " + x + " is a negative number");

        }

        //полный условный оператор

        x = 234; //переопределил значение переменной x

        if (x >= 0) {
            System.out.println("x = " + x + " is a positive number");


        } else {
            System.out.println("x = " + x + " is a negative number");


        }// end of else

        //четное нечетное
        x = 111;
        if (x % 2 == 0) {
            System.out.println("x =" + x + "is even");

        } else {
            System.out.println("x =" + x + " is odd");

        }
        //Возраст
        int age = 19;
        if (age >= 18) {
            System.out.println("Вам разрешено действовать самостоятельно");

        } else {
            System.out.println("Вам нужно прийти вместе с вашим опекуном");
        }


    }//end of main


}//end of class
