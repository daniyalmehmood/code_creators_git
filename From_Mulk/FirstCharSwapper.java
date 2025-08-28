//Map-2 > allSwap

import java.util.HashMap;
import java.util.Map;

public class FirstCharSwapper {
    public String[] swapPairsWithMatchingInitials(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String firstChar = String.valueOf(strings[i].charAt(0));

            if (!map.containsKey(firstChar)) {
                map.put(firstChar, i);
            } else {
                int j = map.get(firstChar);
                String temp = strings[j];
                strings[j] = strings[i];
                strings[i] = temp;
                map.remove(firstChar);
            }
        }

        return strings;
    }
}