//Map-2 > word0

import java.util.HashMap;
import java.util.Map;

public class WordToZeroMap {
    public Map < String,
    Integer > wordZeroMap
    (String[]strings) {
        HashMap < String,
        Integer > newMap = new HashMap <  > ();

        for (int i = 0; i < strings.length; i++) {
            if (!newMap.containsKey(strings[i])) {
                newMap.put(strings[i], 0);
            }
        }
        return newMap;
    }

}