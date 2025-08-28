import java.util.HashMap;
import java.util.Map;

public class FirstCharSwapController {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                Integer prevIndex = map.get(key);
                if (prevIndex != null) {
                    String word = strings[i];
                    strings[i] = strings[prevIndex];
                    strings[prevIndex] = word;
                }
                map.put(key, null);  // Mark that this key has been used for a swap
            } else { // else: skip — already swapped once
                map.put(key, i);
            }

        }
        return strings;

    }

}
