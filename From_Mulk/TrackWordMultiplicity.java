//Map-2 > wordMultiple

import java.util.HashMap;
import java.util.Map;

public class TrackWordMultiplicity {
    public Map<String, Boolean> identifyWordsWithDuplicates(String[] strings) {
        Map<String, Boolean> newMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String Key = strings[i];
            if (newMap.containsKey(Key)) {
                newMap.put(Key, true);
            } else {
                newMap.put(Key, false);
            }
        }
        return newMap;
    }
}