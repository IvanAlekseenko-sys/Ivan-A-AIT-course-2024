package classwork_33.month;

public class MonthAppl {
    public static void main(String[] args) {
        Month m = Month.AUG;
        System.out.println("Initial month" + m);

        int q = 6;
        m = m.plusMonth(q);
        System.out.println(" After " + q + "months: " + m);// FEB
    }
}
