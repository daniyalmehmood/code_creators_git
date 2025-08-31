import java.util.HashMap;
import java.util.Map;

// Swaps only the first two words that share the same starting letter
public class FirstSwapByFirstChar {
    public String[] firstSwapByFirstChar(String[] words) {
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String firstChar = words[i].substring(0, 1);
            if (!indexMap.containsKey(firstChar)) {
                indexMap.put(firstChar, i);
            } else if (indexMap.get(firstChar) >= 0) {
                int prevIndex = indexMap.get(firstChar);
                String temp = words[i];
                words[i] = words[prevIndex];
                words[prevIndex] = temp;
                indexMap.put(firstChar, -1); // lock this letter, no more swaps
            }
        }
        return words;
    }
}