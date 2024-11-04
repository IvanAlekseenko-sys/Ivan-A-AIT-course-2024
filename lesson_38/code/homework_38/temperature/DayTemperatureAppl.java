package homework_38.temperature;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayTemperatureAppl {
    public static void main(String[] args) {
        List<DayTemperature> octoberDayTemperature = new ArrayList<>();
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 25), 15.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 26), 16.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 27), 17.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 28), 18.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 29), 16.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 30), 14.0));
        octoberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 10, 31), 13.0));


        List<DayTemperature> novemberDayTemperature = new ArrayList<>();
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 1), 13.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 2), 14.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 3), 12.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 4), 11.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 5), 10.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 6), 8.0));
        novemberDayTemperature.add(new DayTemperature(LocalDate.of(2024, 11, 7), 9.0));

        List<DayTemperature> twoWeekList = new ArrayList<>();
        twoWeekList.addAll(octoberDayTemperature);
        twoWeekList.addAll(novemberDayTemperature);
        System.out.println("Daily temperature for 2 week period: ");
        printList(twoWeekList);

        System.out.println("--------------averageTemperature-------------");
        double averageTemperature = averageTemperature(twoWeekList);
        System.out.println("Average temperature for 2 week period: " + averageTemperature);


    }

    private static void printList(List<DayTemperature> list) {
        for (DayTemperature i : list) {
            System.out.println(i);
        }

    }

    private static double averageTemperature(List<DayTemperature> list) {
        double sum = 0;
        for (DayTemperature i : list) {
            sum += i.getTemperature();
        }
        return sum / list.size();
    }
}
