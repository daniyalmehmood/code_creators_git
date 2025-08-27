//Map-2 > pairs

import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {
    public Map < String,
    String > mapFirstToLastChar(String[]strings) {
        HashMap < String,
        String > newMap = new HashMap <  > ();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            newMap.put(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(word.length() - 1)));
        }

        return newMap;
    }

}