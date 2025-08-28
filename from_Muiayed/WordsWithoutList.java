import java.util.*;

public class WordsWithoutList {
    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (w.length() != len) {
                result.add(w);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(wordsWithoutList(new String[]{"a","bb","b","ccc"}, 1));
        System.out.println(wordsWithoutList(new String[]{"a","bb","b","ccc"}, 3));
        System.out.println(wordsWithoutList(new String[]{"a","bb","b","ccc"}, 4));
    }
}