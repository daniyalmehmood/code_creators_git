// Map-2 > firstSwap

import java.util.HashMap;
import java.util.Map;

public class OneTimeSwap {
    public String[] swapFirstMatchingPairs(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);

                if (prevIndex != -1) { // -1 means this char already swapped
                    String tempWord = strings[i];
                    strings[i] = strings[prevIndex];
                    strings[prevIndex] = tempWord;
                    map.put(firstChar, -1);
                }
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}