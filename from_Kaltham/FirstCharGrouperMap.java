//Map-2 > firstChar


import java.util.HashMap;
import java.util.Map;


public class FirstCharGrouperMap {
    public Map < String,
    String > groupByFirstChar(String[]strings) {
        HashMap < String,
        String > newMap = new HashMap <  > ();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));
            if (newMap.containsKey(firstChar)) {
                newMap.put(firstChar, newMap.get(firstChar) + strings[i]);

            } else {
                newMap.put(firstChar, strings[i]);
            }

        }

        return newMap;
    }
}