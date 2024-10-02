package homework;
//Создайте массив, который содержит возраст студентов группы.
//        - какой возраст максимальный?
public class MaxElement {
    public static void main(String[] args) {
        int[] age = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 43};
        int max = age [0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max){
                max = age [i];


            }

        }

        System.out.println("Max age = " + max);
    }//end of main


}//end of class
