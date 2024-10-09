package classwork_20.wrapper_classes_examples;

import javax.xml.transform.Source;
import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {
        int k = 1234567890;
        System.out.println(k);
        System.out.println("---------------------------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        integer = integer + 5;
        System.out.println(integer);


        int value1 = 123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("----------------------");

        //автоупаковка
        Integer x = 5;
        System.out.println(x * 10);

        //автораспаковка
        int z = x + integer;
        System.out.println(z);

        System.out.println("-----------------------------");
        BigInteger myBigInt = new BigInteger("1234567890123456789");
        System.out.println(myBigInt);


//        Integer n = 1234;
//        String str2 = n.toString();
//        System.out.println(str2);
//        int u = str2.length();
//        System.out.println(u);

        //количество цифр в числе, 2-я версия решения
        int b = 1234567890;
        Integer bInt = b;
        //смена типа
        String str = bInt.toString(); //числу сменили тип на String
        System.out.println(str);
        int l = str.length();
        System.out.println("Number: " + b + " contains " + l + " digits");

        System.out.println("------------------------------");

        System.out.println("Max value of int " + bInt.MAX_VALUE);
        System.out.println("Min value of int " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println(d.MAX_VALUE);

        System.out.println("-------------------------------------------");
        //мат вычисления
        int n = 20;
        Integer m = 10;

        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        System.out.printf("Length of circle: %.2f", circleLength);
        System.out.println("------------------------------");
        //NaN и Infinite
        double p = 20 / 0.0;
        if (Double.isNaN(p) || Double.isInfinite(p)) {
            System.out.println(" wrong operation, division by zero");
        } else System.out.println(p);


        System.out.println("------------------------------");

        //перевод String в число
        String str2 = "0078765432100";
        long num = Long.parseLong(str2);
        System.out.println(num);
    }//end of main

}//end of class
