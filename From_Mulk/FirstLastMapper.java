//Map-2 > pairs

import java.util.HashMap;
import java.util.Map;

public class FirstLastMapper {
    public Map<String, String> buildFirstToLastMap(String[] strings) {
        Map<String, String> newMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!(newMap.containsKey(strings[i]))) {
                String value = strings[i];
                newMap.put(String.valueOf(value.charAt(0)), (String.valueOf(value.charAt(value.length() - 1))));

            }
        }
        return newMap;
    }

}