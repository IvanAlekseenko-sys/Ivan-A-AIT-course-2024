package classwork_30.soldier;
//- John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann", 162, 55, 88

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("John", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)
        };
    }//end of method

    //- отсортировать солдат "естественным" образом - по росту

    @Test
    void testNativeSorting() {
        System.out.println("------------Print as is------------");
        printArray(soldiers);
        Arrays.sort(soldiers); //native, by default sort
        System.out.println("------------Print sorted by height ( after native sorting)------------");
        printArray(soldiers);
    }

    //- отсортировать по имени

    @Test
    void testSortingByName() {
        Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                return - s1.getName().compareTo(s2.getName());//reverse sorting
            }

        };
        System.out.println("------------Print as is------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorByName);
        System.out.println("------------Print sorted by name------------");
        printArray(soldiers);


    }
    //- по весу

    @Test
    void testSortingByWeight() {
        System.out.println("------------Print as is------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (w1, w2)  -> Double.compare(w1.getWeight(), w2.getWeight()));
        System.out.println("------------Print sorted by weight------------");
        printArray(soldiers);
    }


    //two and more factors for sorting
    @Test
    void testSortingByNameAndHeight() {
        Comparator<Soldier> comparatorByNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                int res = s1.getName().compareTo(s2.getName());
                return res != 0 ? res : Integer.compare(s1.getHeight(), s2.getHeight());
                }
            };
        System.out.println("------------Print as is------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorByNameAndHeight);
        System.out.println("------------Print sorted by name and height------------");
        printArray(soldiers);
    }

    //- по значению профайла и росту
    @Test
    void testSortSoldiersByProfileAndHeight(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = (s1.getProfile() - s2.getProfile()); // sort by Profile
            return res !=0 ? res : Integer.compare(s1.getHeight(), s2.getHeight());
        });
        System.out.println();
        printArray(soldiers);
    }
//- проверить работу метода binarySearch на массиве объектов

       @Test
       void testBinarySearch(){
           System.out.println("------------Print as is------------");
           printArray(soldiers);
           Arrays.sort(soldiers, (s1, s2) -> (s1.getProfile() - s2.getProfile()));
           System.out.println("------------Print sorted by profile------------");
           printArray(soldiers);
           //create object pattern for searching
           Soldier pattern = new Soldier (null, 0, 0, 100);
           int index = Arrays.binarySearch(soldiers, pattern, (s1, s2) -> (s1.getProfile() - s2.getProfile()));
           System.out.println("Index of pattern = " + index);
       }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}//end of class