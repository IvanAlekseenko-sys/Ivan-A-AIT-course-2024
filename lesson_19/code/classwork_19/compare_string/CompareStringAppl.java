package classwork_19.compare_string;
//равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {
        int x = 5; //stack
        int y = 5; //stack
    boolean checker = (x == y);
        System.out.println(checker); // true


        String str1 = "Europe"; //str1 - stack =>(link) Europe - heap
        String str2 = "Europe"; //str2 - stack =>(link) Europe - heap
        System.out.println("-------------------------------------");

        checker = (str1 == str2); //true
        System.out.println(checker);

        System.out.println("-------------------------------------");

        String str3 = new String("Europe"); // new object created
        checker = (str1 == str3);
        System.out.println(checker); // false, because links are not equals

        System.out.println("------------------------------");
        checker = str1.equals(str3);// compare Strings with method equals
        System.out.println(checker);

    }//end of main


}//end of class
