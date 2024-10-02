package classwork;
//Имеются оценки абитуриента из его аттестата, всего 12 оценок.
//Найдите средний балл абитуриента.
public class StudentsMarks {
    public static void main(String[] args) {
        int[] marks = {1,6,1,4,3,1,2,3,3,2,5,2};// Объявление массива в явном виде
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks [i];


        }
        System.out.println("Sum =" + sum);
         double averageMark = (double) sum / marks.length; // casting из int в double
        System.out.println("Average mark = " + averageMark);
    }//end of main


}//end of class
