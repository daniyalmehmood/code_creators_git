import java.util.ArrayList;
import java.util.List;

public class FilteredWordList {
    public List removeWordsOfLength(String[] words, int len) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                newArray.add(words[i]);
            }

        }
        return newArray;
    }

}
