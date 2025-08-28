// Map-2 > allSwap

import java.util.HashMap;
import java.util.Map;

public class WordSwapByFirstChar {
    public String[] wordSwapByInitial(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);
                String tempWord = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = tempWord;
                map.remove(firstChar);
            } else { //if first char has not been seen before
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}