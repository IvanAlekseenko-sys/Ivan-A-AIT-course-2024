package homework_33.week_day;

public class WeekDayAppl {
    public static void main(String[] args) {
        WeekDay[] weeks = WeekDay.values();
        System.out.println("------Days of the week--------");
        for (WeekDay w : weeks) {
            System.out.println(w.getName());

        }

        System.out.println("-----toString-----");
        String str = WeekDay.MON.toString();
        System.out.println(str);

        System.out.println("-----------------------");
        WeekDay mon = WeekDay.MON;
        System.out.println("The first day of the week is: " + mon);

        System.out.println("----------Ordinal------------");
        int num = WeekDay.MON.ordinal();
        System.out.println(num);
        num = WeekDay.FRI.ordinal();
        System.out.println(num);

        System.out.println("---------ValueOf--------");
        WeekDay d = WeekDay.valueOf("MON");
        System.out.println(d);

        int quantity = 10;
        mon = mon.weekDayPlus(quantity);
        System.out.println("After " + quantity + "days " + mon);
    }
}
