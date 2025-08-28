//Map-2 > firstSwap

import java.util.HashMap;
import java.util.Map;

public class LimitedCharSwap {
    public String[] singleSwapPerStartingChar(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);

            if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
            } else if (map.get(firstChar) != -1) {
                int j = map.get(firstChar);
                String temp = strings[j];
                strings[j] = strings[i];
                strings[i] = temp;
                map.put(firstChar, -1);
            }
        }

        return strings;
    }
}