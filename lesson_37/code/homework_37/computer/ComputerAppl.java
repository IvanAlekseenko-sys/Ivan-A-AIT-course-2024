package homework_37.computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//На основе класса Computer:
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.
public class ComputerAppl {
    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("Apple", "M4", 16, 1024));
        computerList.add(new Computer("Sony", "i7", 16, 2048));
        computerList.add(new Computer("Acer", "i5", 8, 768));
        computerList.add(new Computer("Apple", "M3", 8, 512));
        computerList.add(new Computer("Lenovo", "Ryzen5", 32, 768));
        computerList.add(new Computer("Dell", "Ryzen7", 16, 1024));


        System.out.println("-------unsorted-----------");
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        System.out.println("-------------sortedByBrand--------------------");
        computerList.sort(Computer::compareTo);
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        Comparator<Computer> comparatorByRam = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }

        };

        System.out.println("-------------sortedByRam---------------");
        computerList.sort(comparatorByRam);
        for (Computer computer : computerList) {
            System.out.println(computer);
        }


        Comparator<Computer> comparatorByRamAndSsd = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int res = Integer.compare(o1.getRam(), o2.getRam());
                return res != 0 ? res : Integer.compare(o1.getSsd(), o2.getSsd());
            }

        };
        System.out.println("-------------sortedByRamAndSsd------------------");
        computerList.sort(comparatorByRamAndSsd);
        for (Computer computer : computerList) {
            System.out.println(computer);
        }
        System.out.println("--------sumSsd------------");
        int sumSsd = computerList.get(0).getSsd() + computerList.get(1).getSsd() + computerList.get(2).getSsd() + computerList.get(3).getSsd() + computerList.get(4).getSsd() + computerList.get(5).getSsd();
        System.out.println(sumSsd);

        System.out.println("----------averageSsdValue---------------");
        double averageSsd = sumSsd / 6;
        System.out.println(averageSsd);
    }
}



