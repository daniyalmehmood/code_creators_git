// AP-1 > wordsWithoutList

import java.util.ArrayList;
import java.util.List;

public class WordsListEditor {
    public List removeWordsOfLen(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (len != words[i].length()) {
                result.add(words[i]);
            }
        }
        return result;
    }
}