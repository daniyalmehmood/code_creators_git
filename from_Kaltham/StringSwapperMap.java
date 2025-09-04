//Map-2 > allSwap


import java.util.HashMap;
import java.util.Map;

public class StringSwapperMap {
    public String[]swapFirstCharPairs(String[]strings) {
        HashMap < String,
        Integer > newMap = new HashMap <  > ();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));
            if (!newMap.containsKey(firstChar)) {
                newMap.put(firstChar, i);
            } else {
                Integer indexSwap = newMap.get(firstChar);
                String wordSwap = strings[indexSwap];
                strings[indexSwap] = strings[i];
                strings[i] = wordSwap;
                newMap.remove(firstChar);

            }
        }
        return strings;
    }
}