//Map-2 > wordAppend

import java.util.HashMap;
import java.util.Map;

public class WordTracker {
    public String buildStringFromEvenWordRepeats(String[] strings) {
        Map<String, Integer> newMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (!(newMap.containsKey(strings[i]))) {
                newMap.put(strings[i], 1);
            } else {
                newMap.put(strings[i], newMap.get(strings[i]) + 1);
            }
            if (newMap.get(strings[i]) % 2 == 0) {
                result.append(strings[i]);
            }
        }
        return result.toString();
    }


}