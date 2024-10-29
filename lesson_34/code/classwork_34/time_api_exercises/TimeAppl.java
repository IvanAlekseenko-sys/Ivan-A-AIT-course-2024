package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {
        //What time is it now?

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("------------------");
        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin);
        //какой это был день недели?
        System.out.println(gagarin.getDayOfWeek());
        //какой это был день в году?
        System.out.println(gagarin.getDayOfYear());
        //високосный ли год?
        int year = 2024;
        System.out.println("Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("How many days have passed since Gagarin's flight?");
        System.out.println(gagarin.isBefore(ld)); // true
        System.out.println(gagarin.isAfter(ld)); // false
        System.out.println("------------------");
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);

        System.out.println("----------------DateTimeFormatter------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE; // yyyy-MM-dd
        String date = gagarin.format(df);//localDate to String
        System.out.println(date); // Переконверчено в стринг

        //выбираем другой формат
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        //задаем другой, собственный формат строки с датой
        System.out.println("------------------------");
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        //задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        date = gagarin.format(df);
        System.out.println(date);

        //parsing LocalDate from String
        System.out.println("///////////////////////////////////////////////");
        String stringDate = "29/02/2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyyy]"));
        System.out.println(result);// ISO  format
    }
}
