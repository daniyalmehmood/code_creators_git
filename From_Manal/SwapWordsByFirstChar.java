import java.util.HashMap;
import java.util.Map;

// Swaps words that start with the same letter (first-come first-swap)
public class SwapWordsByFirstChar {
    public String[] swapWordsByFirstChar(String[] words) {
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String firstChar = words[i].substring(0, 1);
            if (indexMap.containsKey(firstChar)) {
                int prevIndex = indexMap.get(firstChar);
                String temp = words[i];
                words[i] = words[prevIndex];
                words[prevIndex] = temp;
                indexMap.remove(firstChar); // remove after swap
            } else {
                indexMap.put(firstChar, i);
            }
        }
        return words;
    }
}