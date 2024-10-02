package cycles;
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket2 {

    public static void main(String[] args) {

    int countdown = 10;
        System.out.println("Ракета подготовлена к запуску");
        while (0 < countdown){
            countdown--;
            System.out.println("Отсчет " + countdown);

        }
        System.out.println("Поехали!");


    }//end of main


}//end of class

