package classwork_41.treeset;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {
        TreeSet<String> rivers = new TreeSet<>(Arrays.asList("Volga", "Danube", "Rein", "Elbe", "Neva", "Isar"));
        System.out.println(rivers.size());
        System.out.println(rivers);

        for (String r : rivers) {
            System.out.println(r);

        }
        System.out.println(rivers.higher("Rein")); //Volga
        System.out.println(rivers.lower("Rein")); //Neva

    }
}
