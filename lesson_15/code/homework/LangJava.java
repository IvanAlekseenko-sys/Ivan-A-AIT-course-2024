package homework;

//Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.
public class LangJava {
    public static void main(String[] args) {
        String strJava = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(strJava);

        //выводим на печать последний символ
        System.out.println("The last symbol in the sentence is: " + strJava.substring(strJava.length() - 1));

        //находим позицию подстроки Java
        int index = strJava.indexOf("Java");
        System.out.println("The first occurrence of the word 'Java' is at " + index + " index");
        index = strJava.lastIndexOf("Java");
        System.out.println("The last occurrence of the word 'Java' is at " + index + " index");

        //проверяем есть ли в тексте нужная нам строка
        String strJavaCheck = "Java";
        boolean checker = strJava.contains(strJavaCheck);
        System.out.println("Does the string contain the word 'Java'?: " + checker);

        //меняем все о на а
        System.out.println("Replacing all 'o' characters with 'a': " + strJava.replace("o", "a"));

        //преобразуем строку к верхнему регистру
        System.out.println("String in uppercase: " + strJava.toUpperCase());

        //преобразуем строку к нижнему регистру
        System.out.println("String in lowercase: " + strJava.toLowerCase());

        //вырезаем подстроку Java сабстрингом
        System.out.println("Substring 'Java': " + strJava.substring(19, 23));

        //проверяем заканчивается ли подстрока символами "!!!"
        checker = strJava.endsWith("!!!");
        System.out.println("Does the string end with the '!!!' symbols? :" + checker);
        checker = strJava.startsWith("I'm proud");
        System.out.println("Does the string start with the 'I'm proud'? :" + checker);

    }//end of main

}//end of class



