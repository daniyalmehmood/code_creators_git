import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterWords {//AP-1 > wordsWithoutList

    public static void main(String[] args) {
        System.out.println(Arrays.toString(excludeWordsOfLength(new String[]{"a", "bb", "b", "ccc"}, 1))); // → [bb, ccc]
        System.out.println(Arrays.toString(excludeWordsOfLength(new String[]{"a", "bb", "b", "ccc"}, 3))); // → [a, bb, b]
        System.out.println(Arrays.toString(excludeWordsOfLength(new String[]{"a", "bb", "b", "ccc"}, 4))); // → [a, bb, b, ccc]
    }
    public static String[] excludeWordsOfLength(String[] words, int len) {
     List<String> filteredWordsList = new ArrayList<>();
     for (String word : words) {
        if (word.length() != len) {
            filteredWordsList.add(word);
        }
     }
     return filteredWordsList.toArray(new String[0]);
    }
}