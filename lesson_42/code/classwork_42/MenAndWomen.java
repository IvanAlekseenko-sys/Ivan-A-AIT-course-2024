package classwork_42;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {
    public static void main(String[] args) {
        //m- male, f- female

        Map<String, String> genderMap = new HashMap();

        genderMap.put("LK", "m");
        genderMap.put("IV", "m");
        genderMap.put("JR", "m");
        genderMap.put("OF", "f");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GT", "f");
        genderMap.put("GA", "f");

        //1 option - проходим по Keys, keySet
        int men = 0;

        for (String key : genderMap.keySet()) {
            if (genderMap.get(key).equals("m")) {
                men++;
            }
        }
        int s = genderMap.size();
        int women = s - men;

        System.out.println("men: " + men + " women: " + women);
        women = 0;
        //2 option - проходим по values, values()
        for (String v : genderMap.values()) {
            if (v.equals("f")) {
                women++;
            }

        }
        System.out.println("men: " + men + " women: " + women);
    }
}
