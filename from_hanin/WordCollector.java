import java.util.HashMap;
import java.util.Map;

public class WordCollector {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }

            if (map.get(word) % 2 == 0) {
                result += word;
            }
        }
        return result;
    }

}
