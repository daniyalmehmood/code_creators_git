//Map-2 > wordMultiple

import java.util.HashMap;
import java.util.Map;


public class WordMultiplicityMap {
    public Map < String,
    Boolean > checkMultipleOccurrences(String[]strings) {
        HashMap < String,
        Boolean > newMap = new HashMap <  > ();
        for (int i = 0; i < strings.length; i++) {
            if (!newMap.containsKey(strings[i])) {
                newMap.put(strings[i], false);
            } else {
                newMap.put(strings[i], true);
            }

        }

        return newMap;
    }

}