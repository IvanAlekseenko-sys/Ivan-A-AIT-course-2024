package cycles;
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {
    public static void main(String[] args) {
        //задаем начальные условия
        int countDown = 10;
        System.out.println("We have " +countDown + " sec before the start");
        while (countDown > 0){
            countDown--;
            System.out.println("We have " + countDown + " till the start" );

        }
        System.out.println("Here we go!");
    }//end of main

}//end of class
