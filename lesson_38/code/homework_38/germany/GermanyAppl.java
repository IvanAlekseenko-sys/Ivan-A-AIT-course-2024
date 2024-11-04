package homework_38.germany;

import homework_38.temperature.DayTemperature;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//В классе GermanyAppl создать LinkedList, содержащий города - столицы земель Германии. Опробовать на нем методы, которые доступны для класса LinkedList. Добавить вольный город Гамбург в начало, в середину списка, в конец списка. Отсортировать список по алфавиту и в обратном порядке.
public class GermanyAppl {

    public static void main(String[] args) {
        List<String> landsCapitalsList = new LinkedList<>();
        landsCapitalsList.add("Berlin");
        landsCapitalsList.add("Munich");
        landsCapitalsList.add("Stuttgart");
        landsCapitalsList.add("Potsdam");
        landsCapitalsList.add("Bremen");
        landsCapitalsList.add("Hamburg");
        landsCapitalsList.add("Wiesbaden");
        landsCapitalsList.add("Schwerin");
        landsCapitalsList.add("Hanover");
        landsCapitalsList.add("Düsseldorf");
        landsCapitalsList.add("Mainz");
        landsCapitalsList.add("Saarbrücken");
        landsCapitalsList.add("Dresden");
        landsCapitalsList.add("Magdeburg");
        landsCapitalsList.add("Kiel");
        landsCapitalsList.add("Erfurt");

        System.out.println("List of capitals: ");
        printList(landsCapitalsList);

        landsCapitalsList.remove(5); // removing "Hamburg"
        System.out.println("List of capitals after removing Hamburg: ");
        printList(landsCapitalsList);

        landsCapitalsList.addFirst("Hamburg"); // adding "Hamburg" to the beginning
        System.out.println("List of capitals after adding Hamburg to the beginning: ");
        printList(landsCapitalsList);

        System.out.println("List of capitals after removing the first element: ");
        landsCapitalsList.removeFirst();
        printList(landsCapitalsList);

        landsCapitalsList.add(8,"Hamburg");
        System.out.println("List of capitals after adding Hamburg to the middle: ");
        printList(landsCapitalsList);

        System.out.println("List of capitals after removing the middle element: ");
        landsCapitalsList.remove(8);
        printList(landsCapitalsList);

        System.out.println("List of capitals after adding Hamburg to the end: ");
        landsCapitalsList.addLast("Hamburg");
        printList(landsCapitalsList);

        System.out.println("List of capitals after sorting alphabetically: ");
        landsCapitalsList.sort(null);
        printList(landsCapitalsList);

        System.out.println("List of capitals after sorting in reverse order: ");
        landsCapitalsList.sort(Comparator.reverseOrder());
        printList(landsCapitalsList);

    }



   private static void printList(List<String> list) {
       for (String i : list) {
           System.out.println(i);
       }
    }

}
