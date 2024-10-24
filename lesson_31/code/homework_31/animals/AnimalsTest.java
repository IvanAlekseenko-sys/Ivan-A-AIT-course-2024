package homework_31.animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {
    Animals[] animals;
    @BeforeEach
    void setUp() {
        animals = new Animals[5];
        animals[0] = new Animals(3,"dog",20,60,"omnivore");
        animals[1] = new Animals(1,"cat",6,25,"carnivore");
        animals[2] = new Animals(2,"lion",180,120,"carnivore");
        animals[3] = new Animals(5,"dinosaur",8000,400,"carnivore");
        animals[4] = new Animals(4,"kangaroo",85,100,"herbivore");

    }

    //print
    public void printArray(Object[] array){
        for (Object o : array){
            System.out.println(o);
        }
    }

    @Test
    void testComparable(){
        System.out.println("----------animals as is----------");
        printArray(animals);
        Arrays.sort(animals);
        System.out.println("-------------animals sorted by id-------------");
        printArray(animals);
        Animals pattern = new Animals(1,null,0,0,null);
        int index = Arrays.binarySearch(animals, pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByType(){
        Comparator<Animals> comparatorByType = new Comparator<Animals>() {
            @Override
            public int compare(Animals o1, Animals o2) {
                return o1.getType().compareTo(o2.getType());
            }
        };
        System.out.println(("----------animals as is----------"));
        printArray(animals);
        Arrays.sort(animals, comparatorByType);
        System.out.println(("----------animals sorted by type----------"));
        printArray(animals);

        Animals pattern = new Animals(0,"dog",0,0,null);
        int index = Arrays.binarySearch(animals, pattern, comparatorByType);
        System.out.println(index);
        if (index > 0){
            System.out.println("Found animal: " + pattern.getType() + " on index " + index);
        } else {
            System.out.println("Animal : " + pattern.getType() + " wasn't found, but it could be on index" + (-index - 1));
        }
    }

    @Test
    void testArrayCopy() {
        Animals[] animalsCopy = Arrays.copyOf(animals, animals.length * 2);
        printArray(animalsCopy);
        System.out.println(animalsCopy.length);
        Comparator<Animals> comparatorByType = Comparator.nullsLast((animals1, animals2) -> animals1.getType().compareTo(animals2.getType()));
        Arrays.sort(animalsCopy, comparatorByType);
        printArray(animalsCopy);
        Animals pattern = new Animals(0,"cat",0,0,null);
        int index = Arrays.binarySearch(animalsCopy, pattern, comparatorByType);
        System.out.println(index);
    }

    @Test
    void testInsertKeepSorting() {
        Arrays.sort(animals);
        System.out.println("---------animals sorted by id-----------------");
        printArray(animals);
        Animals[] animalsCopy7 = Arrays.copyOf(animals, animals.length + 1);
        Animals animal = new Animals(6,"squirrel",1,12,"herbivore");
        int index = Arrays.binarySearch(animalsCopy7, 0, animalsCopy7.length - 1, animal);
        index = index >= 0 ? index : - index - 1;
        System.arraycopy(animalsCopy7, index, animalsCopy7, index + 1, animalsCopy7.length - index - 1);
        animalsCopy7 [index] = animal;
        animals = animalsCopy7;
        System.out.println("----------animals with squirrel inserted-------------");
        printArray(animals);
    }
}