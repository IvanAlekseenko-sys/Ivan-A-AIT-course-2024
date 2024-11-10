package classwork_42;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl {
    public static void main(String[] args) {
        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"};

       printWordFrequency(words);

    }

    private static void printWordFrequency(String[] words) {
       //Key - это слово, Value - это сколько раз оно попалось в массиве
        Map< String , Integer > resultMap = new HashMap<>();
        for (String word : words) {
            if(!resultMap.containsKey(word)){ //когда слово попалось 1-й раз
                resultMap.put(word, 1);
            }else { //когда слово уже такое есть в Map
                resultMap.put(word,resultMap.get(word) + 1); //тогда увеличиваем частоту использования слова на 1
            }

        }
        //print resultMap

        for (String w : resultMap.keySet()) {
            System.out.println("Word: " + w + ", frequency: " + resultMap.get(w));

        }
    }

}
