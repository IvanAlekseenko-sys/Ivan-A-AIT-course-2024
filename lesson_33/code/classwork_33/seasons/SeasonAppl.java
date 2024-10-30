package classwork_33.seasons;

//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.Values() - извлекает данные в массив
//.toString
//.ordinal()
//.valueOf()
public class SeasonAppl {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        System.out.println("--------------values of Enum");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }

//for each
        for (Season s : seasons) {
            System.out.println(s.getDuration());

        }
        System.out.println("-----------toString-----------");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("------------Ordinal()-----------");
        int num = Season.AUTUMN.ordinal();
        System.out.println(num);
        num = Season.WINTER.ordinal();
        System.out.println(num);

        System.out.println("------------valueOf()-----------");
        Season s = Season.valueOf("SPRING");
        System.out.println(s);

    }
}

