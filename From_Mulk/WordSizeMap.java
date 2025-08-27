//Map-2 > wordLen

import java.util.HashMap;
import java.util.Map;

public class WordSizeMap {
    public Map<String, Integer> createWordLengthMap(String[] strings) {
        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!(newMap.containsKey(strings[i]))) {
                newMap.put(strings[i], strings[i].length());
            }
        }

        return newMap;

    }
}