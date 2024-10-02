package string_methods;


public class StringAppl {
    public static void main(String[] args) {

        String str1 = "Hello,";

        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!' }; // 32 - код пробела в ASCII

        String str2 = new String(chars); // str2 это объект класса String, сделанный конструктором
        //new - это обращение к конструктору класса

        System.out.println(str1); // Hello
        System.out.println(str2); //  World!

        //concat - объединение, складывание объектов типа String
        String str = str1 + str2;
        System.out.println(str);

        System.out.println(str1.concat(str2)); // конкатенация с помощью метода (объединение)
        System.out.println(str1); // str1 не изменилась, так как тип String является неизменяемым immutable

        //length of String
        int l = str.length(); // определяем длину строки
        System.out.println(l);

        //first symbol
        char ch = str.charAt(0); // отобразить на позиции такой то
        System.out.println("First symbol: " + ch);

        //last symbol
        ch = str.charAt(str.length() - 1); // отобразить на позиции такой то
        System.out.println("Last symbol: " + ch);

        //print with spaces
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();

        //check equals
        String str3 = " worLD!";
        boolean checker = str3.equals(str2);// "str2 = World!"
        System.out.println(checker);
        checker = str3.equalsIgnoreCase(str2);// "str2 = World!"
        System.out.println(checker);

        System.out.println("-----------------------------");
        //Symbol in position
        System.out.println(str);
        int index = str.indexOf('W');
        System.out.println(index);// 7
        index = str.lastIndexOf("W"); //идем справа на лево при поиске ??? - НЕТ
        System.out.println(index);

        index = str.indexOf('o');
        System.out.println(index);//
        index = str.lastIndexOf("o");
        System.out.println(index);


        System.out.println("------------------substring-------------------------");
        System.out.println(str.substring(7)); // с 7 до конца
        System.out.println(str.substring(7, 10)); //с 7-10 substring подходит для диапазона

        System.out.println("-----------replace---------------");
        System.out.println(str.replace("o", "0-0-0"));

        System.out.println("------------------split-------------------------");
        // number of words
        String str4 = "I love string in Java";
        String[] words = str4.split(" ");
        int w = words.length;
        System.out.println("Numbers of words in sentence: " + w);

        //numbers  of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: " + let); // считает все символы

        System.out.println("------------------String.format-------------------------");
//        Вставьте в строку дату полета Гагарина в виде:
//        "Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
//                Используйте String.format()
        int day = 12;
        String month = "April";
        int year = 1961;
        String gagarinDay = String.format("Дата полета Гагрина в космос: %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);

    }//end of main

}//end of class
