//Map-2 > wordCount

import java.util.HashMap;
import java.util.Map;


public class WordCounterMap {
    public Map < String,
    Integer > wordCount(String[]strings) {
        HashMap < String,
        Integer > newMap = new HashMap <  > ();
        for (int i = 0; i < strings.length; i++) {
            if (newMap.containsKey(strings[i])) {
                newMap.put(strings[i], newMap.get(strings[i]) + 1);

            }
            if (!newMap.containsKey(strings[i])) {
                newMap.put(strings[i], 1);
            }

        }

        return newMap;
    }
}