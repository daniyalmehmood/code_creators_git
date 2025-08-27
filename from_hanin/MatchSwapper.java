import java.util.HashMap;
import java.util.Map;

public class MatchSwapper {
    public String[] firstCharSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                int prevIndex = map.get(key);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }


}
