package homework_15;

import java.util.Scanner;

//Напишите программу, которая запрашивает строку от пользователя и затем:
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.
public class UserStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string: ");
        String user = scanner.nextLine();
        // number of words
        String[] words = user.split(" ");
        int w = words.length;
        System.out.println("Numbers of words in sentence: " + w);
        //number of symbols
        String[] letters = user.split("");
        int let = letters.length;
        System.out.println("Numbers of all symbols in sentence: " + let);

        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        }//end of main

    }//end of Class
