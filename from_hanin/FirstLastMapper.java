import java.util.HashMap;
import java.util.Map;

public class FirstLastMapper {
    public Map<String, String> mapFirstToLastChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            map.put(word.substring(0, 1), word.substring(word.length() - 1));
        }
        return map;
    }
}
