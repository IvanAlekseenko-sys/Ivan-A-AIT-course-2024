package classwork_08;


import javax.xml.transform.Source;
import java.util.Scanner;

//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.
public class LettersInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String");
        String word = scanner.nextLine();

        System.out.println(word);

        int l = word.length();
        System.out.println(l);
        int count = 0;


        //Ivan
        //0123
        while (count < l) {
            System.out.println(word.charAt(count));
            count++;//count = count + 1
        }

    }//end of main


}//end of class
