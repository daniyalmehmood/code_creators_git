//Map-2 > word0

import java.util.HashMap;
import java.util.Map;

public class MapWordToZero {
    public Map<String, Integer> createZeroValueWordMap(String[] strings) {
        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!(newMap.containsKey(strings[i]))) {
                newMap.put(strings[i], 0);
            }
        }
        return newMap;
    }

}