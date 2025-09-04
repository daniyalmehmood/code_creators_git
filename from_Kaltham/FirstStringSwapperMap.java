//Map-2 > firstSwap

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstStringSwapperMap {
    public String[]swapFirstOnly(String[]strings) {
        HashMap < String,
        Integer > newMap = new HashMap <  > ();
        HashSet < String > usedSet = new HashSet <  > ();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));
            if (!newMap.containsKey(firstChar)) {
                newMap.put(firstChar, i);
            } else if (usedSet.contains(firstChar)) {
                continue;
            } else {
                Integer indexSwap = newMap.get(firstChar);
                String wordSwap = strings[indexSwap];
                strings[indexSwap] = strings[i];
                strings[i] = wordSwap;
                newMap.remove(firstChar);
                usedSet.add(firstChar);

            }
        }

        return strings;
    }

}