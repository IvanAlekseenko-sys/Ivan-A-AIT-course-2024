package methods;

public class Circus {

    public static void main(String[] args) {

     lightOn();
     entertainer();
     lightOff();


    }// end of main


    public static void lightOn(){
        System.out.println("Lights ONNNN!!!");
    }
    public static void lightOff(){
        System.out.println("Lights OFF...");
    }

    public static void entertainer(){
        jogger();
        clown();
        singer();
    }

    public static void jogger(){
        System.out.println("I'm jogging...");
    }
    public static void clown() {
        System.out.println("I'm joking...");
    }
    public static void  singer() {
        System.out.println("I'm singing");
    }


}// end of class
