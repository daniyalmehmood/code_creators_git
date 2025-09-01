import java.util.HashMap;
import java.util.Map;

public class ZeroMapBuilder {
    public Map<String, Integer> buildZeroMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 0);
            }
        }
        return map;
    }
}
