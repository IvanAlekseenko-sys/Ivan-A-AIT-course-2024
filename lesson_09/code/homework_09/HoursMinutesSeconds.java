package homework_09;
//В программе задаются часы, минуты и секунды.
//Нужно вывести общее количество секунд, прошедших с начала суток.
//Вычисление произведите в методе, который получает на вход часы, минуты и секунды.
public class HoursMinutesSeconds {
    public static void main(String[] args) {
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int passedTime = passedTimeMethod(hours, minutes, seconds);
        System.out.println("Day lasts " + passedTime +" seconds");
    }//end of main

    public static int passedTimeMethod (int hours, int minutes, int seconds){
        int passedTime = hours * minutes * seconds;
        return passedTime;


    }

}//end of class
