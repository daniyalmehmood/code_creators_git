//Map-2 > firstChar

import java.util.HashMap;
import java.util.Map;

public class FirstCharMapper {
    public Map<String, String> groupStringsByFirstChar(String[] strings) {
        Map<String, String> newMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String value = strings[i];
            String firstChar = String.valueOf(value.charAt(0));
            if (newMap.containsKey(firstChar)) {
                newMap.put(firstChar, newMap.get(firstChar) + value);
            } else {
                newMap.put(firstChar, value);

            }
        }
        return newMap;
    }

}